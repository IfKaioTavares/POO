package exerciseList1.questao11.src.model;
import java.time.LocalDate;
import java.util.Objects;

import exerciseList1.questao11.src.enums.GeneroProduto;

public class Produto {
    private String nome;
    private double preco;
    private GeneroProduto tipo;
    private int qtdEstoque;
    private LocalDate validade;

    public Produto(String nome, double preco, GeneroProduto tipo, LocalDate validade){
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.qtdEstoque = 0;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque += qtdEstoque;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public GeneroProduto getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && tipo == produto.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, tipo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", tipo=" + tipo +
                ", validade=" + validade +
                '}';
    }
}
