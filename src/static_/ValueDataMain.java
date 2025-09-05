package static_;

import procedure_oriented_programming.material.ValueData;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
    }
    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("Increase Value, value=" + valueData.value);

    }
}
