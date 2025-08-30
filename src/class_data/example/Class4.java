package class_data.example;

public class Class4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "Student1";
        student1.age = 15;
        student1.grade = 90;
        Student student2 = new Student();
        student2.name = "Student2";
        student2.age = 16;
        student2.grade = 80;
        Student[] students = new Student[]{student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("Name:" + students[i].name + " Age:" + students[i].age + " Grade:" + students[i].grade);
        }
    }
}
