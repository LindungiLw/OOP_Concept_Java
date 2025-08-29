package method.practice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("1. Deposit | 2. Withdraw | 3. Check Balance | 4. Exit");
        System.out.println("------------------------------------------------------");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

    }
    public static void deposit(int balance, int depositAmount){
        System.out.println("You deposited " + depositAmount + " rupiah. ");
        balance += depositAmount;
        System.out.println("Current balance: " + balance + " rupiah.");

    }
    public static void withdraw(int balance, int withdrawAmount){
        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println("You withdrew " + withdrawAmount + " rupiah.");
            System.out.println("Current balance: " + balance + " rupiah.");
        }else{
            System.out.println("You tried to withdraw " + withdrawAmount + " rupiah, but your balance is insufficient.");
        }

    }
    public static void checkBalance(int balance){
        System.out.println("Your current balance is: " + balance + " rupiah.");
    }
}
