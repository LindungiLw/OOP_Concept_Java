package polymorphism.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow caw = new Cow();
        Animal[] animalArr = {dog, cat, caw};

        for (Animal animal : animalArr) {
            System.out.println("Animal Sound Test Starts");
            animal.sound();
            System.out.println("Animal Sount Test Ends");
        }
    }
}
