package inheritance.practice;

public class Album extends Item{
    private String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }
    public void print() {
        super.print();
        System.out.println("- Artist: " + artist);
    }
}
