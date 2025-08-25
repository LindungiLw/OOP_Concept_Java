package scope_type_casting.type_casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 222222234;
        long maxIntOver = 222222234L;
        int intValue = 0;
        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);
        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue);
    }
}
