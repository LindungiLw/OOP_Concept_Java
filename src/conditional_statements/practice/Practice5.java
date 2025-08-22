package conditional_statements.practice;

public class Practice5 {
    public static void main(String[] args) {
        String grade = "F";

        switch (grade){
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
                System.out.println("Very Good!");
                break;
            case "C":
                System.out.println("Good!");
                break;
            case "D":
                System.out.println("Need Improvement!");
                break;
            case "F":
                System.out.println("Fail!");
                break;
            default:
                System.out.println("Invalid grade!");
        }
    }
}
