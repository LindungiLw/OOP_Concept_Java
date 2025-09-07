package final_;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;

        final int data2 = 10;
        method(10);
    }
    static void method(final int parameter) {
    // parameter = 20; Compile Error
    }
}
