package scope_type_casting.scope;

public class Scope4 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0){
            int temp  = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
