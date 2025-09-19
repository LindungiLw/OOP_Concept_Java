package polymorphism.interface1;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("Bawwow");
    }
    @Override
    public void move() {
        System.out.println("Dog moves");
    }
}
