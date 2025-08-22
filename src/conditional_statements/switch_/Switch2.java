package conditional_statements.switch_;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;
        switch (grade){
            case 1:
                coupon = 10000;
                break;
            case 2:
                coupon = 20000;
                break;
            case 3:
                coupon = 30000;
                break;
            default:
                coupon = 5000;
        }
        System.out.println("Coupon: " + coupon);
    }
}
