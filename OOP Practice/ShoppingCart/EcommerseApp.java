package ShoppingCart;

public class EcommerseApp {
    public static void main(String[] args) {
        Item item1 = new Item("USb", 1000, 2);
        Item item2 = new Item("trimmer", 2000, 1);

        Cart hamzaCart = new Cart();
        hamzaCart.addItem(item2);
        hamzaCart.addItem(item1);

        hamzaCart.displayCartDetaials();
    }
}
