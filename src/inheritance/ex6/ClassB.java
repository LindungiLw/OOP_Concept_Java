package inheritance.ex6;

public class ClassB extends ClassA{
    public ClassB(int a) {
        super();
        System.out.println("ClassB Constructor a="+a);
    }
    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB Constructor a="+a + " b=" + b);
    }
}
