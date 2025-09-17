package polymorphism.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        System.out.println("Animal Sound Test Starts");
                dog.sound();
        System.out.println("Animal Sound Test Ends");
        System.out.println("Animal Sound Test Starts");
        cat.sound();
        System.out.println("Animal Sound Test Ends");
        System.out.println("Animal Sound Test Starts");
        cow.sound();
        System.out.println("Animal Sound Test Ends");
    }
}
