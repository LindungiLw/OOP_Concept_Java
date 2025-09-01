package constructors.material;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        System.out.println("Constructor Called, name = " + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
    }
    MemberConstruct(String name, int age, int grade) {
        System.out.println("Constructor Called, name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
