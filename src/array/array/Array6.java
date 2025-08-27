package array.array;

public class Array6 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.println(arr[0][0] + " ");
        System.out.println(arr[0][1] + " ");
        System.out.println(arr[0][2] + " ");
        System.out.println(arr[1][0] + " ");
        System.out.println(arr[1][1] + " ");
        System.out.println(arr[1][2] + " ");
        System.out.println();

        for (int row = 0; row < 2; row++) {
            System.out.println(arr[row][0] + " ");
            System.out.println(arr[row][1] + " ");
            System.out.println(arr[row][2] + " ");
            System.out.println();
        }

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
