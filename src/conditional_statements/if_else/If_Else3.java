package conditional_statements.if_else;

public class If_Else3 {
    public static void main(String[] args) {
        int age = 14;
        if (age <= 7){
            System.out.println("Preschool");
        }
        if (age >= 8 && age <= 13){
            System.out.println("Elementary school student");
        }
        if (age >= 8 && age <= 13){
            System.out.println("Middle school student");
        }
        if (age >= 17 && age <= 19){
            System.out.println("High school student");
        }
        if (age >= 20){
            System.out.println("Adult");
        }
    }
}
