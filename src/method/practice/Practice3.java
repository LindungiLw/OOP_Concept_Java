package method.practice;

public class Practice3 {
    public static void main(String[] args) {
        int balance = 150000;
        int depositAmount = 100000;
        int withdrawAmount = 50000;
        balance = deposit(balance, depositAmount);
        balance = withdraw(balance, withdrawAmount);
        System.out.println("Final balance: " + balance + " rupiah");
    }
    public static int deposit(int balance, int depositAmount){
        System.out.println("You deposited " + depositAmount + " rupiah. ");
        balance += depositAmount;
        System.out.println("Current balance: " + balance + " rupiah.");
        return balance;
    }
    public static int withdraw(int balance, int withdrawAmount){
        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println("You withdrew " + withdrawAmount + " rupiah.");
            System.out.println("Current balance: " + balance + " rupiah.");
        }else{
            System.out.println("You tried to withdraw " + withdrawAmount + " rupiah, but your balance is insufficient.");
        }
        return balance;
    }
}
