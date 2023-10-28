package exerciseList1.questao4;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
public class Tenente {
    private String nome;
    private int identificacao;
    private int tempoServico;
    private Capitao imediato;
    private ArrayList<Sargento> subordinados;

    public Tenente(String nome, int identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.tempoServico = 0;
        this.subordinados = new ArrayList<>();
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public Capitao getImediato() {
        return imediato;
    }

    public void setImediato(Capitao imediato) {

        if (!(Objects.equals(this.imediato, imediato))) {
            Capitao imediatoAntigo = this.imediato;
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

    public List<Sargento> getSubordinados() {
        return List.copyOf(subordinados);
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void addSubordinado(Sargento sargento) {
        sargento.setImediato(this);
        if(!this.subordinados.contains(sargento)){
            this.subordinados.add(sargento);
        }
    }

    public void removeSubordinado(Sargento sargento){
        this.subordinados.remove(sargento);
        sargento.setImediato(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tenente tenente = (Tenente) o;
        return identificacao == tenente.identificacao && Objects.equals(nome, tenente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, identificacao);
    }
}
