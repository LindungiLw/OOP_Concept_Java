package method.exersice;

public class Method1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a + " + " + b + " Calculation ");
        int sum1 = a + b;
        System.out.println("Result1: " + sum1);

        int x = 10;
        int y = 20;
        System.out.println(x + " + " + y + " Calculation ");
        int sum2 = x + y;
        System.out.println("Result2: " + sum2);

        int sum3 = add(5, 10);
        System.out.println("Result 1: " + sum3);
        int sum4 = add(15, 20);
        System.out.println("Result 2: " + sum4);
    }

    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " Calculation ");
        int sum = a + b;
        return sum;
    }
}
