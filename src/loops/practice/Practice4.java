package loops.practice;

public class Practice4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(j + " * " + i + " = " + j * i + " ");
            }
            System.out.println();
        }
    }
}
