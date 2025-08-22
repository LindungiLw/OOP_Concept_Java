package conditional_statements.if_else;

public class If_Else4 {
    public static void main(String[] args) {
        int age = 14;
        if (age <= 7){
            System.out.println("Preschool");
        } else if (age <= 13){
            System.out.println("Elementary school student");
        } else if (age <= 16){
            System.out.println("Middle school student");
        }else if (age <= 19){
            System.out.println("High school student");
        } else {
            System.out.println("Adult");
        }

    }
}
