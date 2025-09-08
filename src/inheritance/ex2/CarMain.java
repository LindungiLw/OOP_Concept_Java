package inheritance.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}