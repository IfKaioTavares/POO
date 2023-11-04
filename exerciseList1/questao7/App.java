package exerciseList1.questao7;

public class App {
    public static void main(String[] args) {
        Client cl1 = new Client("Kaio Tavares", "kaiosandek@gmail.com");
        Product p1 = new Product("Feijao", 9.5f, 7);
        Product p2 = new Product("Arroz", 6.4f);
        p2.addStock(5);
        Cart c1 = new Cart();
        c1.addProducts(p1,5);
        c1.addProducts(p2,3);
        System.out.println(c1.getProductList());
        System.out.println(Shop.totalPurchases(c1));
        System.out.println(Shop.shopInvoice(c1,cl1));

    }
}
