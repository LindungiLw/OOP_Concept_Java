package scanner.practice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of digits in the multiplication table: ");
        int num = scanner.nextInt();

        System.out.println(num + " multiplication table: ");

        for (int i = 1; i <= num; i++) {
            for (int j = num; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
