package static_.material;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }
    static void method1() {
        System.out.println("method1 start");
        Data1 data1 = new Data1(10);
        method2(data1);
        System.out.println("method1 end");
    }
    static void method2(Data1 data2) {
        System.out.println("method2 start");
        System.out.println("data.value="
                + data2.getValue());
        System.out.println("method2 end");
    }
}
