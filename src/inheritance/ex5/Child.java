package inheritance.ex5;

public class Child extends Parent{
    public String value = "child";
    @Override
    public void hello() {
        System.out.println("Child.hello");
    }
    public void call() {
        System.out.println("this value = "
                + this.value);
        System.out.println("super value = " + super.value);
        this.hello();
        super.hello();
    }
}
