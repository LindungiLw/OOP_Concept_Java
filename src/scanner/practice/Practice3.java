package scanner.practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the food name: ");
        String food = scanner.next();

        System.out.print("Enter the food price: ");
        int price = scanner.nextInt();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        System.out.println("You ordered " + quantity + " of " + food + ". The total price is " + (price * quantity) + " rupiah.");
    }
}
