package polymorphism.abstract2;

public class Dog extends AbstractAnimal{
    @Override
    public void sound() {
        System.out.println("Bowwow");
    }

    @Override
    public void move() {
        System.out.println("Dog moves");
    }
}
