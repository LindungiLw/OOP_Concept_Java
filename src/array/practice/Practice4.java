package array.practice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 5 integers: ");

        int[] num = new int[5];

        double sum = 0;
        double average = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
            average = sum / num.length;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
