package access_modifier.encapsulation;

public class BankAccount {
    private int balance;
    public BankAccount() {
        balance = 0;
    }
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
    public int getBalance() {
        return balance;
    }
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
