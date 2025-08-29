package method.practice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. Deposit | 2. Withdraw | 3. Check Balance | 4. Exit ");
            System.out.println("------------------------------------------------------");
            System.out.print("Select: ");
            int choice = scanner.nextInt();
            int balance = 0;
            int depositAmount = 0;
            switch (choice) {
                case 1:
                    balance = deposit(balance, depositAmount);
                    break;
                case 2:
                    withdraw(balance);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our service.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    public static int deposit(int balance, int depositAmount){
        Scanner scannerDeposit = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        int deposit = scannerDeposit.nextInt();
        balance += deposit;
        System.out.println("You have deposited " + deposit + " rupiah. Current balance = " + balance + " rupiah.");
        return deposit;
    }
    public static void withdraw(int balance){
        Scanner scannerWithdraw = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount: ");
        int withdraw = scannerWithdraw.nextInt();
        if (balance >= withdraw){
            balance -= withdraw;
        }else {
            System.out.println("Your balance is minus.");
        }
        System.out.println("You tried to withdraw " + withdraw + " rupiah. Current balance: " + balance + " rupiah.");
    }
    public static void checkBalance(){
    }

}
