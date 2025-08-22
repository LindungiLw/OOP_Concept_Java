package conditional_statements.switch_;

public class Switch4 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon = switch (grade){
            case 1 -> 10000;
            case 2 -> 20000;
            case 3 -> 30000;
            default -> 5000;
        };
        System.out.println("Coupon: " + coupon);
    }
}
