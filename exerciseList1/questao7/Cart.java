package exerciseList1.questao7;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private ArrayList<Item> itemList;

    public Cart(){
        this.itemList = new ArrayList<>();
    }

    public void addProducts(Product product, int quantity){
        if(quantity <= product.getStock()){
            product.removeStock(quantity);
            this.itemList.add(new Item(product,quantity));
        }
    }

    public void removeProducts(Product product, int quantity){
        for(Item item: this.itemList){
            if(item.getProduct().equals(product)){
                if(quantity < item.getQuantity()){
                    item.setQuantity(item.getQuantity() - quantity);
                    item.getProduct().addStock(quantity);
                } else if (quantity == item.getQuantity()) {
                    this.itemList.remove(item);
                    item.getProduct().addStock(quantity);
                }
            }
        }
    }

    public List<Item> getProductList() {
        return List.copyOf(this.itemList);
    }
}
