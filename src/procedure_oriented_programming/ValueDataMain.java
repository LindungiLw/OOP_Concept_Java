package procedure_oriented_programming;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("Final Number=" + valueData.value);
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("Increased Number, value=" + valueData.value);
    }
}
