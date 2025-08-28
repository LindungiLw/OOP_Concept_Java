package method.exersice;

public class Method7 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("Before invoking changeNumber, num1: " + num1);
        num1 = changeNumber(num1);
        System.out.println("After invoking changeNumber, num1: " + num1);
    }
    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
