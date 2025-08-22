package conditional_statements.practice;

public class Practice1 {
    public static void main(String[] args) {
        int score = 55;
        String grade;
        if (score >= 90){
            grade = "A";
        } else if (score >= 80){
            grade = "B";
        } else if (score >= 70){
            grade = "C";
        } else if (score >= 60){
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Score = " + score);
        System.out.println("Your Grade is " + grade);
    }
}
