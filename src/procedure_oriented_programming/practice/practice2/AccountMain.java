package procedure_oriented_programming.practice.practice2;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100000);
        account.withdraw(90000);
        account.withdraw(20000);
        System.out.println("Balance = " + account.getBalance());

    }
}
