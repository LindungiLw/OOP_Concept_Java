package array.practice;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int numberArray = scanner.nextInt();

        System.out.println("Enter the " + numberArray + " integers: ");

        int[] num = new int[numberArray];
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
