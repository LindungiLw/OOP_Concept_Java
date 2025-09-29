package polymorphism.practice.practice3;

public class OvoPay implements platform {
    @Override
    public boolean pay(int amount) {
        System.out.println("Connects to the OVO Pay system.");
        System.out.println("Attempting to make a payment of "+ amount + "rupiah.");
        return true;
    }
}