package array.array;

public class Array8 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        int i = 1;

        for (int row = 0; row < args.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }
    }
}
