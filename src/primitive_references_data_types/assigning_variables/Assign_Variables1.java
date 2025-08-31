package primitive_references_data_types.assigning_variables;

public class Assign_Variables1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 20;
        System.out.println("Changed a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 30;
        System.out.println("Changed b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
