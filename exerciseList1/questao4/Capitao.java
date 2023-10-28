package exerciseList1.questao4;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
public class Capitao {
    private String nome;
    private int identificacao;
    private int tempoServico;
    private ArrayList<Tenente> subordinados;

    public Capitao(String nome, int identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.tempoServico = 0;
        this.subordinados = new ArrayList<>();
    }

    public int getIdentificacao() {
        return identificacao;
    }
    public String getNome() {
        return nome;
    }

    public List<Tenente> getSubordinados() {
        return List.copyOf(subordinados);
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void addSubordinado(Tenente tenente) {
        tenente.setImediato(this);
        if(!this.subordinados.contains(tenente)){
            this.subordinados.add(tenente);
        }
    }

    public void removeSubordinado(Tenente tenente){
        this.subordinados.remove(tenente);
        tenente.setImediato(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capitao capitao = (Capitao) o;
        return identificacao == capitao.identificacao && Objects.equals(nome, capitao.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, identificacao);
    }
}

