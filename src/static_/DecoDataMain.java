package static_;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. Static Method Called");
        DecoData.staticCall();
        System.out.println("2. Instance Method Called1");
        DecoData data1 = new DecoData();
        data1.instanceCall();
        System.out.println("3. Instance Method Called2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}
