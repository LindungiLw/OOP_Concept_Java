package conditional_statements.ternary_operator;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 20;
        String status;
        if (age >= 18){
            status = "Adult";
        } else {
            status = "Minor";
        }
        System.out.println("Age = " + age + ", Status = " + status);
    }
}
