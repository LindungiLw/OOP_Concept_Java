package inheritance.practice;

public class Book extends Item {
    private String author;
    private int isbn;

    public Book(String name, int price, String author, int isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }
    public void print() {
        System.out.println("Book Print");
    }
}
