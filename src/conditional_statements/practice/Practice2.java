package conditional_statements.practice;

public class Practice2 {
    public static void main(String[] args) {
        int distance = 150;

        if (distance <= 1){
            System.out.println("Take a Walking");
        } else if (distance <= 10){
            System.out.println("Take a Bicycle");
        } else if (distance <= 100){
            System.out.println("Take a Car");
        }else if (distance >= 100){
            System.out.println("Take a Airplane");
        }
    }
}
