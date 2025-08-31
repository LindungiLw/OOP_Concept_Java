package primitive_references_data_types.method_calling;

import class_data.example.Student;

public class Method3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "Student1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "Student2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student){
        System.out.println("Name:" + student.name + " Age:" + student.age + " Grade:" + student.grade);
    }
}
