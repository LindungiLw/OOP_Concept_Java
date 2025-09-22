package polymorphism.ex3;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("Chirp");
    }
    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
