package polymorphism.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();


        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
    }
}
