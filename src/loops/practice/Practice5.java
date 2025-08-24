package loops.practice;

public class Practice5 {
    public static void main(String[] args) {
        int line = 5;

        for (int i = 1; i <= line; i++) {
            System.out.println("*");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
