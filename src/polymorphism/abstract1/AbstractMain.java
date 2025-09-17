package polymorphism.abstract1;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        cat.sound();
        cat.move();
        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("Animal Sound Test Starts");
        animal.sound();
        System.out.println("Animal Sound Test Ends");
    }
}
