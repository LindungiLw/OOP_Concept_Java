package scanner.example;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("The greater number: " + num1);
        } else if (num2 > num1) {
            System.out.println("The greater number: " + num2);
        } else {
            System.out.println("The numbers are same.");
        }
    }
}
