package exerciseList1.questao11.src.model;

import java.util.ArrayList;
import java.util.List;

import exerciseList1.questao11.src.enums.GeneroProduto;

public class Estoque {
    private List<Produto> estoqueProdutos;
    public Estoque(){
        this.estoqueProdutos = new ArrayList<>();
    }

    public void addProduto(Produto produto){
        this.estoqueProdutos.add(produto);
    }

    public void removeProduto(Produto produto){
        this.estoqueProdutos.remove(produto);
    }

    public Produto buscarProduto(String nome, GeneroProduto tipo){
        Produto produtoBase = new Produto(nome,0,tipo,null);
        for(Produto produto: this.estoqueProdutos){
            if(produto.equals(produtoBase) && produto.getQtdEstoque() > 0){
                return produto;
            }
        }
        return null;
    }

    public List<Produto> getEstoqueProdutos(){
        return List.copyOf(this.estoqueProdutos);
    }
}