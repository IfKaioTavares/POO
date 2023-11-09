package exerciseList1.questao11.src.main;
import java.time.LocalDate;
import exerciseList1.questao11.src.enums.GeneroProduto;
import exerciseList1.questao11.src.model.Carrinho;
import exerciseList1.questao11.src.model.Estoque;
import exerciseList1.questao11.src.model.Produto;
import exerciseList1.questao11.src.service.CarrinhoService;
import exerciseList1.questao11.src.service.ProdutoService;

public class App {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService(new Estoque());
        CarrinhoService carrinhoService = new CarrinhoService(new Carrinho(), produtoService);

        Produto p1 = new Produto("Feijao", 9, GeneroProduto.ALIMENTO, LocalDate.of(2024, 3, 15));
        Produto p2 = new Produto("Stella", 12, GeneroProduto.BEBIDA, LocalDate.of(2024, 3, 15));
        Produto p3 = new Produto("Sabonete Dove", 8, GeneroProduto.HIGIENE, LocalDate.of(2024, 3, 15));

        produtoService.adicionarProdutoEstoque(p1, 20);
        produtoService.adicionarProdutoEstoque(p2, 40);
        produtoService.adicionarProdutoEstoque(p3, 4);

        carrinhoService.addProdutos(p1, 8);
        carrinhoService.addProdutos(p2, 20);
        carrinhoService.addProdutos(p3, 4);

        System.out.println(p1.getQtdEstoque());
        System.out.println(p2.getQtdEstoque());
        System.out.println(p3.getQtdEstoque());

        carrinhoService.removeProduto(p3, 1);
        System.out.println(p3.getQtdEstoque());

        System.out.println(carrinhoService.totalCompras());
        carrinhoService.finalizarCompra();
        System.out.println(carrinhoService.totalCompras());
    }
}