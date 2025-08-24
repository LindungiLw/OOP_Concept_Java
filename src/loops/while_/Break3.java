package loops.while_;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;; i++){
            sum += i;
            if (sum > 10){
                System.out.println("Terminate if sum is greater than 10: i = " + i + " sum = " + sum);
                break;
            }
            i++;
        }
    }
}
