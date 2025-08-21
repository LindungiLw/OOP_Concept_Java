package operators.example;

public class Increment_Decrement_Operator1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println(a);

        a = a + 2;
        System.out.println(a);

        a = a + 3;
        System.out.println(a);

        ++a;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);
    }
}
