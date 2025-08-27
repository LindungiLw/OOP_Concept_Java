package array.practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 5 integers: ");

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println("Reverse Order Output: ");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
