package method.practice;

public class Practice3 {
    public static void main(String[] args) {
        int balance = 150000;
        int depositAmount = 100000;
        deposit(balance, depositAmount);
        int withdrawAmount = 50000;


    }
    public static void deposit(int balance, int depositAmount){
        System.out.println("You deposited " + depositAmount + "rupiah. ");
        balance += depositAmount;
        System.out.println("Current balance: " + balance + "rupiah.");
    }
    public static void withdraw(){

    }
}
