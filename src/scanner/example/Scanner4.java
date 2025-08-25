package scanner.example;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the String (exit: end):");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("Exit the Program.");
                break;
            }
            System.out.println("Entered String: " + str);
        }
    }
}
