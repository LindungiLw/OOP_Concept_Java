package polymorphism.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr
                = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animalArr) {
            soundAnimal(animal); }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("Animal Sound Test Starts");
        animal.sound();
        System.out.println("Animal Sound Test Ends");
    }
}