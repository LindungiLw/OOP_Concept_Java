package polymorphism.practice.practice3;

public class GoPay implements platform {
    @Override
    public boolean pay(int amount) {
        System.out.println("Connects to the GoPay system.");
        System.out.println("Attempting to make a payment of "+ amount + " rupiah.");
        return true;
    }
}
