package scanner.practice;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Enter the name (quit - end): ");
            String name = scanner.next();

            if (name.equals("quit")) {
                System.out.println("Exit the program.");
                break;
            }

            System.out.print("Enter the age: ");
            int age = scanner.nextInt();

            System.out.println("Entered name: " + name + ", age: " + age);
        }
    }
}
