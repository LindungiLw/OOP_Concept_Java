package scanner.example;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = scanner.nextLine();
        System.out.println("Entered string: " + str);

        System.out.println("Please enter an integer number:");
        int intValue = scanner.nextInt();
        System.out.println("Entered integer number: " + intValue);

        System.out.println("Please enter a real number:");
        double doubleValue = scanner.nextDouble();
        System.out.println("Entered real number: " + doubleValue);
    }
}
