package org.lexicon;

import java.util.Scanner;

public class bankApp {
    public String accountName;
    public boolean bankId;
    public int balance;
    public final double INTERESTRATE = 5.5;
    public final int RENT = 7500;


    public void deposit() {
        System.out.println("Enter in deposit: ");
        Scanner scanner = new Scanner(System.in);
        int deposit = scanner.nextInt();
        System.out.println("your balance is: " + balance + " you have deposit " + deposit);
        balance += deposit;
    }

    public void getAccountName() {
        System.out.println("name of account " + accountName);
        System.out.println("This account has " + balance + "£");
        System.out.println("has bankid? " + bankId);


    }

    public void mortgageCost() {
        System.out.println("mortgage is: " + RENT * INTERESTRATE);
    }

    public boolean blackCard(boolean blackCard) {
        if (blackCard == true) {
            System.out.println("you are special! ");
        }
        return blackCard;
    }


}