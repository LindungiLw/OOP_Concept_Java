package loops.practice;

public class Practice3 {
    public static void main(String[] args) {
        int sum = 1;
        int max = 100;
        int j = 1;
        for (int i = 1; i < max; i++) {
            j++;
            sum += i * j;
        }
        System.out.println(j);
    }
}
