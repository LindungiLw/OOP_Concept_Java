package polymorphism.practice.practice3;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();


        while (true) {
            System.out.print("Please enter a payment method: ");
            String option = scanner.next();

            if (option.equals("exit")){
                System.out.println("Exit the program.");
                break;
            }

            System.out.print("Please enter the payment amount: ");
            int amount = scanner.nextInt();

            payService.processPay(option, amount);
        }
    }
}
