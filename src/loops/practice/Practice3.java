package loops.practice;

public class Practice3 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 100;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);

        int sum2 = 0;
        int i = 1;
        while (i <= max){
            sum2 += i;
            i++;
        }
        System.out.println(sum2);
    }
}
