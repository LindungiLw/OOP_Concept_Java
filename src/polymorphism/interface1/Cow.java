package polymorphism.interface1;

public class Cow implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("Moo");
    }
    @Override
    public void move() {
        System.out.println("Cow moves");
    }
}
