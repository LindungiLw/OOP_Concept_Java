package procedure_oriented_programming.practice.practice2;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
    }
    void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
        } else {
            System.out.println("Your balance is insufficient.");
        }

    }
    int getBalance(){
        return balance;
    }
}
