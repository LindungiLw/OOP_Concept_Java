package inheritance.ex4;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1;
        publicMethod();
        protectedMethod();
        printParent();
    }
}