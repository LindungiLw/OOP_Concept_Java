package array.array;

public class Array1 {
    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;
        int student6 = 40;

        System.out.println("Student1's score: " + student1);
        System.out.println("Student2's score: " + student2);
        System.out.println("Student3's score: " + student3);
        System.out.println("Student4's score: " + student4);
        System.out.println("Student5's score: " + student5);
        System.out.println("Student6's score: " + student6);

        // using array

        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        System.out.println();
        System.out.println("Student1' score: " + students[0]);
        System.out.println("Student2' score: " + students[1]);
        System.out.println("Student3' score: " + students[2]);
        System.out.println("Student4' score: " + students[3]);
        System.out.println("Student5' score: " + students[4]);


    }
}
