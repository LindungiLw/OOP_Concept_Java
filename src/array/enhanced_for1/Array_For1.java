package array.enhanced_for1;

public class Array_For1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];
            System.out.println(number);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; ++i) {
            System.out.println("The result of number " + i + " : " + numbers[i]);
        }
    }
}
