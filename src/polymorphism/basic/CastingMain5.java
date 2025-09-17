package polymorphism.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 calls");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 calls");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child Instance");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}