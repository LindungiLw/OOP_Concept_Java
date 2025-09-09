package inheritance.practice;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 100000, "Han", 12345);
        Album album = new Album("ALBUM1", 50000,"Seo");
        Movie movie = new Movie("Movie1", 40000,"Director1", "Actor1");

        book.print();
        album.print();
        movie.print();

//        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
//        System.out.println("Total Price: " + sum);
    }
}
