package static_;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data4 data1 = new Data4("A");
        System.out.println("A count=" + Data4.count);
        Data4 data2 = new Data4("B");
        System.out.println("B count=" + Data4.count);
        Data4 data3 = new Data4("C");
        System.out.println("C count=" + Data4.count);
    }
}
