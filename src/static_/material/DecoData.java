package static_.material;

public class DecoData {
    private int instanceValue;
    private static int staticValue;
    public static void staticCall() {
//instanceValue++; // Access to Instance Var., compile error
//instanceMethod(); // Access to Instance Method, compile error
        staticValue++; // Access to Static Var.
        staticMethod(); // Access to Static Method
    }
    public void instanceCall() {
        instanceValue++; // Access to Instance Var.
        instanceMethod(); // Access to Instance Method
        staticValue++; // Access to Static Var.
        staticMethod(); // Access to Static Method
    }

    private void instanceMethod() {
        System.out.println("instanceValue="
                + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue="
                + staticValue);
    }
}
