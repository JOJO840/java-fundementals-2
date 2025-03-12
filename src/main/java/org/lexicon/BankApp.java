package org.lexicon;

import java.util.Scanner;

public class BankApp {
    public String accountName;
    public boolean bankId;
    private int balance;
    public final int INTERESTRATE = 5;
    public final int RENT = 7500;
    public boolean blackCard;


    public void deposit(int amount) {
        balance += amount;
    }

    public void getAccountName() {
        System.out.println("name of account " + accountName);
        System.out.println("This account has " + balance + "£");
        System.out.println("has bankid? " + bankId);


    }

    public void mortgageCost() {
        int mortgage = RENT * INTERESTRATE;
        System.out.println("mortgage is: " + mortgage);
    }

    public boolean blackCard() {
        if (blackCard) {
            System.out.println("you are special! ");
        }else System.out.println("you have no Blackcard");
        return blackCard;
    }

    public void insurance(){
        if(blackCard){
            System.out.println("you will get insurance because of Blackcard");
        } else System.out.println("you have no Blackcard");
    }

    public int getBalance(){
        return balance;
    }

    public String getAccountInfo(){
        return "your account name is: " + accountName + "and your balance is: " + balance;
    }



}