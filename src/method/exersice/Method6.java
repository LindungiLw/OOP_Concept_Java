package method.exersice;

public class Method6 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. Before invoking changeNumber, num1: " + num1);
        changeNumber(num1);
        System.out.println("4. After invoking changeNumber, num1: " + num1);
    }
    public static void changeNumber(int num2) {
        System.out.println("2. Before changing changeNumber, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("3. After changing changeNumber, num2: " + num2);
    }
}