package conditional_statements.practice;

public class Practice3 {
    public static void main(String[] args) {
        int dollar = 10;
        int IDR = 15000;
        if (dollar < 0){
            System.out.println("Wrong amount.");
        } else if (dollar == 0) {
            System.out.println("There is no amount to exchange.");
        } else if (dollar > 0){
            System.out.println("The exchange amount is " + dollar * IDR + " rupiah.");
        }
    }
}
