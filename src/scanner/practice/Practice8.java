package scanner.practice;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the price (-1 : exit): ");
            int price = scanner.nextInt();

            if (price == -1){
                System.out.println("Exit the program.");
                break;
            }

            System.out.print("Enter the quantity you wish to purchase: ");
            int quantity = scanner.nextInt();

            System.out.println("Total Cost: " + (price * quantity));
        }
    }
}
