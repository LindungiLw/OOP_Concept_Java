package polymorphism.abstract2;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        soundAnimal(cat); soundAnimal(dog);
        soundAnimal(cow); moveAnimal(cat);
        moveAnimal(dog); moveAnimal(cow);
    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("Animal Sound Test Starts");
                animal.sound();
        System.out.println("Animal Sound Test Ends");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("Animal Moving Test Starts");
                animal.move();
        System.out.println("Animal Moving Test Ends");
    }
}
