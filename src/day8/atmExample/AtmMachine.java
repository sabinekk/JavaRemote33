package day8.atmExample;

import java.util.Scanner;

public class AtmMachine {

    int atmCashBalance;
    Scanner scanner;

    public AtmMachine(int atmCashBalance) {
        this.atmCashBalance = atmCashBalance;
        this.scanner = new Scanner(System.in);
    }

    boolean isAuthenticated(CreditCard creditCard) {
        System.out.println("Please enter your pin: ");
        int userEnteredPin = scanner.nextInt();
        return userEnteredPin == creditCard.pinCode;
    }
    int getMenuSelection (){
        System.out.println("Here is the menu.");
        System.out.println("1. Check balance");
        System.out.println("2. Add money");
        System.out.println("3. Withdraw money");
        return scanner.nextInt();
    }
    void showBalance(CreditCard creditCard) {
        System.out.println("Your balance is: " + creditCard.balance);
        System.out.println("ATM current balance is: " + atmCashBalance);
    }

    void addMoney(CreditCard creditCard) {
        System.out.println("How much money would you like to add?");
        int moneyToAdd = scanner.nextInt();
        creditCard.balance = creditCard.balance + moneyToAdd;
        //creditCard.balance +=moneyToAdd; //means the same as the upper expression
        System.out.println("Money added! Your balance now is: " + creditCard.balance);
        atmCashBalance = atmCashBalance + moneyToAdd;
        System.out.println("Total ATM cash balance is: " + atmCashBalance);
    }
    //void withdrawMoney() { add validation so maount for withdraw is not bigger than money in atm

}
