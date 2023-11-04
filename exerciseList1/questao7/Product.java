package exerciseList1.questao7;

import java.util.Objects;

public class Product {
    private String name;
    private float price;
    private int stock;

    public Product(String name, float price){
        this.name = name;
        this.price = price;
    }

    public Product(String name, float price, int stock){
        this(name, price);
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int quantity){
        if(quantity > 0){
            this.stock += quantity;
        }
    }

    public void removeStock(int quantity){
        if(quantity > 0 && this.stock >= quantity){
            this.stock -= quantity;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(price, product.price) == 0 && stock == product.stock && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, stock);
    }
}
