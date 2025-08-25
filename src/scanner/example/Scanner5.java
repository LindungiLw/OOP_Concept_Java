package scanner.example;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you enter 0 for both, the program will end.");
        while (true) {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            if (num1 == 0 && num2 == 0) {
                System.out.println("Program ends");
                break;
            }
            int sum = num1 + num2;
            System.out.println("The sum: " + sum);
        }
    }
}
