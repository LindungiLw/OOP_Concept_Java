package polymorphism.interface2;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }
    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
