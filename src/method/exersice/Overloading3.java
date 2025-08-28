package method.exersice;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    public static int add(int a, int b) {
        System.out.println("Invoked 1");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("Invoked 2");
        return a + b ;
    }
}
