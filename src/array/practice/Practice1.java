package array.practice;

public class Practice1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        double average = 0;

        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        average = total / students.length;
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
    }
}
