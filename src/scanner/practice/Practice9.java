package scanner.practice;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers (-1 : exit:) ");

        int sum = 0;
        double count = 0;
        double average = 0;

        while (true){
            int num = scanner.nextInt();
            if (num == -1){
                break;
            }
            sum += num;
            count += 1;
            average = sum / count;
        }
        System.out.println();
        System.out.println("The sum of entered numbers: " + sum);
        System.out.println("The average of entered numbers: " + average);
    }
}
