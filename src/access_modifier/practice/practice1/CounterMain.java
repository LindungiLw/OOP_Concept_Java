package access_modifier.practice.practice1;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}