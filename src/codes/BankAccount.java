/*
 This is a simple code for simulate opening a bank account
 Make deposits and take money.
 */
package codes;

import util.BankCreateAccount;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder name: ");
        String holder = sc.nextLine();

        System.out.print("Do you want to make an initial deposit? (Y/N)");
        String makeDeposit = sc.nextLine();
        double deposit;
        if (makeDeposit.equals("y") || makeDeposit.equals("Y")){
            System.out.print("Amount of deposit:\nU$: ");
            deposit = sc.nextDouble();

        }else{
            System.out.println();
            System.out.println("Ok, you can deposit later!");
            deposit = 0;
        }
        BankCreateAccount holderOne = new BankCreateAccount(numberAccount, holder, deposit);
        System.out.println(holderOne.opening());
        System.out.println();


        System.out.print("Enter a deposit value\nU$: ");
        double addMoney = sc.nextDouble();
        holderOne.addBalance(addMoney);
        System.out.println(holderOne);


        System.out.print("Withdraw: \nU$:");
        double withdrawMoney = sc.nextDouble();
        holderOne.removeBalance(withdrawMoney);
        System.out.println("Money Withdraw sucesfully!");

        System.out.println(holderOne);
        sc.close();
    }
}
