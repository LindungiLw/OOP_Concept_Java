package conditional_statements.ternary_operator;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 20;
        String status = age >= 18 ? "Adult" : "Minor";
        System.out.println("Age = " + age + ", Status = " + status);
    }
}
