package static_.practice;

public class Car {
    private static int totalCars;
    private String name;
    public Car(String name) {
        this.name = name;
        System.out.println("Purchased Car, Name: " + name);
        totalCars++;
    }
    public static void showTotalCars() {
        System.out.println("Purchased Car Number: " + totalCars);
    }
}
