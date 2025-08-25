package scope_type_casting.type_casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;
        longValue = intValue;
        System.out.println("longValue = " + longValue);
        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);
        doubleValue = 20L;
        System.out.println("doubleValue = " + doubleValue);
        longValue = 20L;
        System.out.println("longValue = " + longValue);
    }
}
