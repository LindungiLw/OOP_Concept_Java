package scanner.practice;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print ("Between number: ");

        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            while (i < num2){
                System.out.print(", ");
                break;
            }
        }
    }
}
