package method.exersice;

public class Method4 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "years old, Minors are not allowed to enter.");
            return;
        }
        System.out.println(age + " years old, please enter.");
    }
}
