package array.practice;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers of integers:");
        int numberArray = scanner.nextInt();

        int[] num = new int[numberArray];
        System.out.println("Enter the 3 integers: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.print("The smallest number: ");
        int smallest = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        System.out.println(smallest);

        System.out.print("The largest number: ");
        int largest = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        System.out.println(largest);
    }
}
