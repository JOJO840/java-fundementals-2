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


        StringFundementals stringExam = new StringFundementals();

        stringExam.getString();

        // Working with Strings Exercise

        // 1.
        String java1 = "Java";
        System.out.println("String length is:" + java1.length());

        //2.
        String stringAtChar6 = "Even longer example sentence";
        System.out.println(stringAtChar6.charAt(6));
        int index = stringAtChar6.indexOf("o");
        System.out.println(index);

        //3.
        String ex3 =  "Ok this is not as long!";
        System.out.println(ex3.substring(11,23));

        //4.
        String ex4 = "CAPS EQUALS SCREAMING";
        System.out.println(ex4.toLowerCase());
        System.out.println(ex4.toUpperCase());

        //5.
        String ex5 =  "Java is the worst programming language!";
        String newEx5  = ex5.replace("worst", "best");
        System.out.println(newEx5);

        // 6.
        String ex6 = "\tJ\ta\tv\ta\t";
        String newEx6 =  ex6.trim();
        System.out.println(newEx6);

        // 7.

    }



}