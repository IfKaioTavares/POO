package exerciseList1.questao4;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
public class Sargento {
    private String nome;
    private int identificacao;
    private int tempoServico;
    private Tenente imediato;
    private ArrayList<Cabo> subordinados;

    public Sargento(String nome, int identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.tempoServico = 0;
        this.subordinados = new ArrayList<>();
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public Tenente getImediato() {
        return imediato;
    }

    public void setImediato(Tenente imediato) {

        if (!(Objects.equals(this.imediato, imediato))) {
            Tenente imediatoAntigo = this.imediato;
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

    public List<Cabo> getSubordinados() {
        return List.copyOf(subordinados);
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void addSubordinado(Cabo cabo) {
        cabo.setImediato(this);
        if(!this.subordinados.contains(cabo)){
            this.subordinados.add(cabo);
        }
    }

    public void removeSubordinado(Cabo cabo){
        this.subordinados.remove(cabo);
        cabo.setImediato(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sargento sargento = (Sargento) o;
        return identificacao == sargento.identificacao && Objects.equals(nome, sargento.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, identificacao);
    }
}
