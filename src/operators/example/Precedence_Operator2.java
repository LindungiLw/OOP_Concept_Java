package operators.example;

public class Precedence_Operator2 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);
        System.out.println("sum3 = " + sum3 + ", sum4 = " + sum4);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
