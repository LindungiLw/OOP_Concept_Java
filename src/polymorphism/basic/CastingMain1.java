package polymorphism.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        Child child = (Child) poly;
        child.childMethod();
    }
}
