package polymorphism.abstract2;

public class Cat extends AbstractAnimal{
    @Override
    public void sound() {
        System.out.println("Mew");
    }
    @Override
    public void move() {
        System.out.println("Cat moves");
    }
}
