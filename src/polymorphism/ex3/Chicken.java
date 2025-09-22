package polymorphism.ex3;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("Cluck");
    }
    @Override
    public void fly() {
        System.out.println("Chicken can't fly");
    }
}
