package primitive_references_data_types.method_calling;

public class Method1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before Calling a method: a = " + a);
        changePrimitive(a);
        System.out.println("After Calling Method: " + a);
    }

    static void changePrimitive(int x){
        x = 20;
    }
}
