package polymorphism.interface1;

public class InterfaceMain {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("Animal Sound Test Starts");
        animal.sound();
        System.out.println("Animal Sound Test Ends");
    }
}
