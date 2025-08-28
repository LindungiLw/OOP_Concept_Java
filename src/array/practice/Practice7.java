package array.practice;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] student = new int[4];
        int[] course = new int[3];

        String[] subjects = {"Bahasa Indonesia", "Matematika", "Bahasa Inggris"};

        for (int i = 0; i < student.length; i++) {
            System.out.println("Please input the Student " + (i + 1) + "'s score: ");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(" - " + subjects[j] + ": ");
                course[j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < student.length; i++) {
            int total = 0;
            for (int j = 0; j < course.length; j++) {
                total += course[j];
            }
            System.out.print("Student " + (i + 1) + " total score: " + total);
            System.out.println(", average score: " + (double) total / course.length);
        }
    }
}
