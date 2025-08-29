package method.practice;

public class Practice2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(message);
    }
    public static void printMessage(String message){
        for (int i = 0; i < 16; i++) {
            System.out.println(message);
        }
    }
}
