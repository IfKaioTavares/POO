package exerciseList1.questao4;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
public class Cabo {
    private String nome;
    private int identificacao;
    private int tempoServico;
    private Sargento imediato;
    private ArrayList<Soldado> subordinados;

    public Cabo(String nome, int identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.tempoServico = 0;
        this.subordinados = new ArrayList<>();
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public Sargento getImediato() {
        return imediato;
    }

    public void setImediato(Sargento imediato) {

        if (!(Objects.equals(this.imediato, imediato))) {
            Sargento imediatoAntigo = this.imediato;
            this.imediato = imediato;
            if(imediatoAntigo!= null){
                imediatoAntigo.removeSubordinado(this);
            }
            if(imediato != null){
                imediato.addSubordinado(this);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Soldado> getSubordinados() {
        return List.copyOf(subordinados);
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void addSubordinado(Soldado soldado) {
        soldado.setImediato(this);
        if(!this.subordinados.contains(soldado)){
            this.subordinados.add(soldado);
        }
    }

    public void removeSubordinado(Soldado soldado){
        this.subordinados.remove(soldado);
        soldado.setImediato(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cabo cabo = (Cabo) o;
        return identificacao == cabo.identificacao && Objects.equals(nome, cabo.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, identificacao);
    }

}
