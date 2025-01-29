package ShoppingCart;

public class Item {
    String name = "null";
    int price = 0;
    int quantity = 0;

    public Item(){

    }
    public Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int totalPrice(){
        return price*quantity;
    }
    public void itemDetails(){
        System.out.println("Name: " + this.name + "Price: " + this.price +"Quantity: "+ quantity + "\nTotal Price of the Item"+ this.totalPrice());
    }
}

