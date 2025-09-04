package access_modifier.practice.practice2;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Milk", 20000, 2);
        Item item2 = new Item("Coke", 10000, 4);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayItems();
    }
}
