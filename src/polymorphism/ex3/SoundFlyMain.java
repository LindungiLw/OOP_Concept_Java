package polymorphism.ex3;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();
        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);
        flyAnimal(bird);
        flyAnimal(chicken);
    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("Animal Sound Test Starts"); animal.sound();
        System.out.println("Animal Sound Test Ends");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("Flying Test Starts");
                fly.fly();
        System.out.println("Flying Test Ends");
    }
}
