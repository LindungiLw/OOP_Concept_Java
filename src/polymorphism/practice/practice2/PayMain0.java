package polymorphism.practice.practice2;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        payService.processPay("go", 50000);
        payService.processPay("ovo", 10000);
        payService.processPay("bad", 15000);
    }
}
