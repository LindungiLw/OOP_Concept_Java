package polymorphism.practice.practice2;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        String payOption1 = "go";
        int amount1 = 50000;
        payService.processPay(payOption1, amount1);

        String payOption2 = "ovo";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
    }
}
