package exerciseList1.questao11.src.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtosCarrinho;

    public Carrinho(){
        this.produtosCarrinho = new ArrayList<>();
    }

    public void addProduto(Produto produto){
        this.produtosCarrinho.add(produto);
    }

    public void removeProduto(Produto produto){
        this.produtosCarrinho.remove(produto);
    }

    public List<Produto> getProdutosCarrinho() {
        return List.copyOf(produtosCarrinho);
    }

    public void finalizarCompra(){
        this.produtosCarrinho.clear();
    }
}
