package scanner.practice;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        while(true) {
            System.out.println("1: Input Product, 2: Payment, 3: Exit Program");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting the program.");
                break;
            }

            if (choice == 1) {
                System.out.print("Enter the product name: ");
                String name = scanner.next();

                System.out.print("Enter the product price: ");
                int price = scanner.nextInt();

                System.out.print("Enter the product quantity: ");
                int quantity = scanner.nextInt();

                int totalIn = price * quantity;

                System.out.println("Product Name: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Total: " + totalIn);

                total += totalIn;
            }

            if (choice == 2) {
                System.out.println("Total cost: " + total);
            }
        }
    }
}
