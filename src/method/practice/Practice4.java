package method.practice;

import java.util.Scanner;

public class Practice4 {
    static int balances = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. Deposit | 2. Withdraw | 3. Check Balance | 4. Exit ");
            System.out.println("------------------------------------------------------");
            System.out.print("Select: ");
            int choice = scanner.nextInt();
            int depositAmount = 0;
            switch (choice) {
                case 1:
                    balances += deposit(balances, depositAmount);
                    break;
                case 2:
                    balances -= withdraw(balances);
                    break;
                case 3:
                    balances = checkBalance(balances);
                    break;
            }
            if (choice == 4) {
                System.out.println("Exit the program.");
                break;
            }
        }
    }
    public static int deposit(int balances, int depositAmount){
        Scanner scannerDeposit = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        int deposit = scannerDeposit.nextInt();
        balances += deposit;
        System.out.println("You have deposited " + deposit + " rupiah. Current balance = " + balances + " rupiah.");
        return deposit;
    }
    public static int withdraw(int balances) {
        Scanner scannerWithdraw = new Scanner(System.in);
        System.out.print("Enter the withdrawal amount: ");
        int withdraw = scannerWithdraw.nextInt();
        if (balances >= withdraw) {
            balances -= withdraw;
        } else {
            System.out.println("Your tried to withdraw " + withdraw + " rupiah, but your balance is insufficient.");
        }
        System.out.println("You have withdraw " + withdraw + " rupiah. Current balance: " + balances + " rupiah.");
        return withdraw;
    }
    public static int checkBalance(int balances){
        System.out.println("Your balance is " + balances + " rupiah.");
        return balances;
    }
}
