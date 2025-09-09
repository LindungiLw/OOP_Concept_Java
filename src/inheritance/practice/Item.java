package inheritance.practice;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        System.out.println("Name" + name + ", Price: " + price);
    }
    public void print() {
        System.out.println("Book Print");
    }
}
