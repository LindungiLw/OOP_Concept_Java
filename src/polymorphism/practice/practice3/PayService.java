package polymorphism.practice.practice3;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result;
        System.out.println("Start payment: option=" + option + ", amount=" + amount);
        if (option.equals("go")) {
            GoPay goPay = new GoPay();
            result = goPay.pay(amount);
        } else if (option.equals("ovo")) {
            OvoPay ovoPay = new OvoPay();
            result = ovoPay.pay(amount);
        } else {
            System.out.println("There is no payment method.");
            result = false;
        }
        if (result) {
            System.out.println("The Payment was successful.");
        } else {
            System.out.println("The Payment was failed.");
        }
    }
}