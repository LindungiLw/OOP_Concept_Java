package loops.practice;

public class Practice2 {
    public static void main(String[] args) {
        int num = 2;

        for (int i = 0; i < 20; i++) {
            if (num % 2 == 0){
                System.out.println(num);
            }
            num++;
        }

        int num2 = 2;
        while (num2 <= 20){
            if (num2 % 2 == 0){
                System.out.println(num2);
            }
            num2++;
        }
    }
}
