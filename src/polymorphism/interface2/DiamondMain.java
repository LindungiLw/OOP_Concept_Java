package polymorphism.interface2;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        InterfaceB b = new Child();
        a.methodCommon();
        b.methodCommon();
        a.methodA();
        b.methodB();
    }
}
