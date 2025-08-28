package array.practice;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productsName = new String[10];
        int[] productsPrice = new int[10];

        int productsCount = 0;

        int[] choices = {1, 2, 3};

        while(true){
            System.out.println("[ 1. Add product  |  2. List product  |  3. Exit ]");

            System.out.print("Please select menu: ");
            int choice = scanner.nextInt();
            int[] maxProducts = new int[4];

            if (choice == choices[0]) {
                System.out.print("- Enter the a product name: ");
                productsName[productsCount] = scanner.next();
                System.out.print("- Enter the a product price: ");
                productsPrice[productsCount] = scanner.nextInt();
                productsCount++;
                if (productsCount == maxProducts.length) {
                    System.out.println("- You can no longer add products.");
                    break;
                }
            }

            if (choice == choices[1]){
                if (productsCount == 0) {
                    System.out.println("- There are no products listed.");
                    break;
                }
                System.out.println("List of products:");
                for (int i = 0; i < productsCount; i++) {
                    System.out.println("- " + productsName[i] + " : " + productsPrice[i] + " rupiah");
                }
            }
            if (choice == choices[2]){
                System.out.println("- Exit the program.");
                break;
            }
            if (choice > choices.length){
                System.out.println("- You selected the wrong menu.");
                break;
            }
        }
    }
}
