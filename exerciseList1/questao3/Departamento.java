package exerciseList1.questao3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Departamento {
    private String nome;
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    public Departamento(String nome){
        this.nome = nome;
    }
    public void addProduto(Produto produto){
        if(!this.listaProdutos.contains(produto)){
            this.listaProdutos.add(produto);
        }
    }
    public void removeProduto(Produto produto){
        this.listaProdutos.remove(produto);
    }
    public String getNome() {
        return nome;
    }
    public List<Produto> getListaProdutos() {
        return Collections.unmodifiableList(this.listaProdutos);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", listaProdutos=" + listaProdutos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.equals(nome, that.nome) && Objects.equals(listaProdutos, that.listaProdutos);
    }
}
