package class_data.example;

public class Class2 {
    public static void main(String[] args) {
        String[] studentNames = {"Student1", "Student2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Name:" + studentNames[i] + " Age:" + studentAges[i] + " Grade:" + studentGrades[i]);
        }
    }
}
