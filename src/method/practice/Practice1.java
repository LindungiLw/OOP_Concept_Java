package method.practice;

public class Practice1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        add(a, b, c);

        int x = 15;
        int y = 25;
        int z = 35;
        add(x, y, z);
    }
    public static void add(int a, int b, int c) {
        double sum = a + b + c;
        double avg = sum / 3;
        System.out.println("Average = " + avg);
    }
}
