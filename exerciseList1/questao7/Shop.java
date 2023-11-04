package exerciseList1.questao7;

public class Shop {
    public static float totalPurchases(Cart cart){
        float total = 0;
        for(Item item: cart.getProductList()){
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }

    public static String shopInvoice(Cart cart, Client client){
        return "Fatura para: " + client.getEmail() +
                "/" + client.getName() +
                "\nTotal: " + totalPurchases(cart);
    }
}
