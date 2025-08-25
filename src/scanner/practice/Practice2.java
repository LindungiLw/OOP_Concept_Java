package scanner.practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is even number.");
        }else
            System.out.println(num + " is odd number.");
    }
}
