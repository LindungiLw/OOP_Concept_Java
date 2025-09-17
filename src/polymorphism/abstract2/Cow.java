package polymorphism.abstract2;

public class Cow extends AbstractAnimal{
    @Override
    public void sound() {
        System.out.println("Moo");
    }
    @Override
    public void move() {
        System.out.println("Cow moves");
    }
}
