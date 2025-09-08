package inheritance.ex4;

public class ElectricCar extends Car{
    @Override
    public void move() {
        System.out.println("Move the electric car faster.");
    }
    public void charge() {
        System.out.println("Charge.");
    }
}
