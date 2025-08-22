package conditional_statements.practice;

public class Practice7 {
    public static void main(String[] args) {
        int x = 3;

        int odd_even_numbers = x % 2;

        if (odd_even_numbers == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
