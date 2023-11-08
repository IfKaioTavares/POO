package exerciseList1.questao11.src.service;

import exerciseList1.questao11.src.enums.GeneroProduto;
import exerciseList1.questao11.src.model.Estoque;
import exerciseList1.questao11.src.model.Produto;

public class ProdutoService {
    private Estoque estoque;

    public ProdutoService(Estoque estoque){
        this.estoque = estoque;
    }

    public void adicionarProdutoEstoque(Produto produto, int qtd){
        if(this.estoque.getEstoqueProdutos().contains(produto)){
            Produto produtoExistente = this.estoque.buscarProduto(produto.getNome(), produto.getTipo());
            produtoExistente.setQtdEstoque(qtd);
        }else{
            this.estoque.addProduto(produto);
            produto.setQtdEstoque(qtd);
        }
    }

    protected void removerProdutoEstoque(String nome, GeneroProduto tipo, int qtd){
        Produto produto = this.estoque.buscarProduto(nome, tipo);
        if(produto != null ){
            if(produto.getQtdEstoque() > qtd){
                produto.setQtdEstoque(-qtd);
            }else if(produto.getQtdEstoque() == qtd){
                produto.setQtdEstoque(-qtd);
                this.estoque.removeProduto(produto);
            }
        }
    }

    protected boolean produtoExiste(String nome, GeneroProduto tipo){
        Produto produtoExistente = this.estoque.buscarProduto(nome, tipo);
        return (produtoExistente != null);
    }

}
