package procedure_oriented_programming;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueObject valueObject = new ValueObject();
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("Final Number= " + valueObject.value);
    }
}
