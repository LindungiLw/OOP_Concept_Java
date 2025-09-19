package polymorphism.interface1;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("Mew");
    }
    @Override
    public void move() {
        System.out.println("Cat moves");
    }
}