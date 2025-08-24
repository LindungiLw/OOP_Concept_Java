package loops.nested;

public class Nested1 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("External for start i: " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("-> Internal for " + i + "_" + j);
            }
            System.out.println("External for end it: " + i);
            System.out.println();
        }
    }
}
