package org.lexicon;

public class Main {
    public static void main(String[] args) {


        BankApp account1 = new BankApp();
        account1.accountName = ("550204");
        account1.bankId = true;
        account1.blackCard = true;



        account1.deposit(15000);

        account1.getAccountName();
        account1.mortgageCost();

        account1.insurance();


    }


}