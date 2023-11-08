package exerciseList1.questao11.src.service;

import java.util.List;

import exerciseList1.questao11.src.model.Carrinho;
import exerciseList1.questao11.src.model.Produto;

public class CarrinhoService {
    private Carrinho carrinho;
    private ProdutoService produtoService;

    public CarrinhoService(Carrinho carrinho, ProdutoService produtoService){
        this.carrinho = carrinho;
        this.produtoService = produtoService;
    }

    public void addProdutos(Produto produto, int qtd){
        if(this.produtoService.produtoExiste(produto.getNome(), produto.getTipo())){
            if(produto.getQtdEstoque() >= qtd){
                this.produtoService.removerProdutoEstoque(produto.getNome(), produto.getTipo(), qtd);
                for (int i = 0; i < qtd; i++) {
                    this.carrinho.addProduto(produto);
                }
            }
        }
    }

    public void removeProduto(Produto produto, int qtd){
        if(this.qtdProdutoCarrinho(produto, qtd)){
            for (int i = 0; i < qtd; i++) {
                this.carrinho.removeProduto(produto);
            }
        }
        this.produtoService.adicionarProdutoEstoque(produto, qtd);
    }

    private boolean qtdProdutoCarrinho(Produto produto, int qtd){
        int qtdExistente = 0;
        for(Produto produtoNoCarrinho: this.carrinho.getProdutosCarrinho()){
            if(produtoNoCarrinho.equals(produto)){
                qtdExistente++;
            }
        }
        return qtdExistente >= qtd;
    }

    public double totalCompras(){
        double total = 0;
        for(Produto produto: this.carrinho.getProdutosCarrinho()){
            total += produto.getPreco();
        }
        return total;
    }

    public void finalizarCompra(){
        this.carrinho.finalizarCompra();
    }

    public List<Produto> getListaDeCompra(){
       return this.carrinho.getProdutosCarrinho();
    }
}
