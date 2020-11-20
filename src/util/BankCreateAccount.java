/*
    Check BankAccount.java for more info.
 */
package util;

public class BankCreateAccount {
    private  int accountNumber;
    private String accountHolder;
    private double initialDeposit;
    private double secondDeposit;

    public BankCreateAccount(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.initialDeposit = initialDeposit;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }


    public void setInitialDeposit(double initialDeposit){

        this.initialDeposit = initialDeposit;
    }


    public void addBalance(double balance){
        this.secondDeposit += balance;
    }
    public void removeBalance(double balance){
        this.secondDeposit = this.secondDeposit - balance - 5;
    }


    private double finalBalance(){
        return secondDeposit + initialDeposit;
    }

    public String opening(){
        return "       INFO     \n" +
                "Account Number: " + accountNumber
                +"\n" + "Acount Holder: " + accountHolder
                +"\n" +"Initial Deposit: " +  initialDeposit;
    }


    @Override
    public String toString(){
        return "    INFO     \n" +
                "Account Number: " + accountNumber
                +"\n" + "Acount Holder: " + accountHolder
                +"\n" + "Balance: " + finalBalance();
    }


}
