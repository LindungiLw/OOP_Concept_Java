package access_modifier.practice.practice1;

public class MaxCounter {
    private int count;
    private int max;
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count < max) {
            count++;
        }
    }
    public int getCount() {
        System.out.println("The maximum cannot be exceeded.");
        return count;
    }
}
