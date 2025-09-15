package polymorphism.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
        ((Child) poly).childMethod();
    }
}
