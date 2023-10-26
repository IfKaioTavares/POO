package exerciseList1.questao3;

import java.util.Objects;

public class Produto {
    private String nome;
    private Departamento departamento;
    private float preco;

    private String tamanho;
    private String cor;

    public Produto(String nome, float preco, String tamanho, String cor, Departamento departamento){
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
        this.departamento = departamento;
        this.departamento.addProduto(this);
    }
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento.removeProduto(this);
        this.departamento = departamento;
        this.departamento.addProduto(this);
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", tamanho='" + tamanho + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Float.compare(preco, produto.preco) == 0 && Objects.equals(nome, produto.nome) && Objects.equals(departamento, produto.departamento) && Objects.equals(tamanho, produto.tamanho) && Objects.equals(cor, produto.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, departamento, preco);
    }
}
