package static_.material;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data3 data1 = new Data3("A", counter);
        System.out.println("A count=" + counter.count);
        Data3 data2 = new Data3("B", counter);
        System.out.println("B count=" + counter.count);
        Data3 data3 = new Data3("C", counter);
        System.out.println("C count=" + counter.count);
    }
}
