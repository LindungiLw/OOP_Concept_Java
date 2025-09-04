package access_modifier.practice.practice2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        }
    }
    public void displayItems() {
        System.out.println("Shopping Cart Product Output");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i]);
        }
        int totalValue = 0;
        for (int i = 0; i < itemCount; i++) {
            totalValue += items[i].getPrice() * items[i].getQuantity();
        }
        System.out.println("Total value: " + totalValue);
    }
}
