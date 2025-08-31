package primitive_references_data_types.method_calling;

import class_data.example.Student;

public class Method4 {
    public static void main(String[] args) {
        Student student1 = createStudent("Student1", 15, 90);
        Student student2 = createStudent("Student2", 16, 80);
        printStudent(student1);
        printStudent(student2);
    }
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
    static void printStudent(Student student1) {
        System.out.println("Name:" + student1.name + " Age:" + student1.age + " Grade:" + student1.grade);
    }
}
