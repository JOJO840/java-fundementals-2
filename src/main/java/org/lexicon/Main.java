package org.lexicon;

public class Main {
    public static void main(String[] args) {


        bankApp account1 = new bankApp();
        account1.accountName = ("550204");
        account1.balance = (15000);
        account1.bankId = (true);



        account1.deposit();

        account1.getAccountName();
        account1.mortgageCost();

        account1.blackCard(true);


    }


}