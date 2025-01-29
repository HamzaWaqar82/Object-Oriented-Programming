package ShoppingCart;

import java.util.ArrayList;

public class Cart {
    ArrayList<Item> itemsList;

    public Cart(){
       itemsList =new ArrayList<>();
    }

    public void addItem(Item item){
        itemsList.add(item);
    }
    public void removeItem(Item item){
        itemsList.remove(item);
    }
    public int  calculateTotal(){
        int total =  0;
        for (Item item : itemsList) {
            total += item.totalPrice();
        }
        return total;
    }

    public void displayCartDetaials(){
        for (Item  item : itemsList) {
            item.itemDetails();
        }
        System.out.println("Total Price for all items: " + this.calculateTotal()     );
    }
}
