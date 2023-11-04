package exerciseList1.questao7;

public class Item {
    private Product product;
    private int quantity;

    public Item(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product.getName() +
                ", quantity=" + quantity +
                '}';
    }
}
