package org.lexicon;

public class StringFundementals {

    String name1 = "Joe Pesci";

    String string1 = "Hello Strings";
    int index1 = string1.indexOf("llo");
    int index2 = string1.indexOf('H');
    int index3 = string1.indexOf('i');
    int index4 = string1.indexOf("lo");

    public void getString() {
        // Get every char on newline fori loop.
        for (int i = 0; i < name1.length(); i++) {
            System.out.println(name1.charAt(i));
        }

        System.out.println("should display 2, result: " + index1);
        System.out.println("should display 0, result: " + index2);
        System.out.println("should display 9, result: " + index3);
        System.out.println("should display 3, result: " + index4);
        System.out.println("should display: ello" + string1.substring(1, 5));
        System.out.println("should display: all lowercase, result: " + string1.toLowerCase());
        System.out.println("should display: all UPPER, result: " + string1.toUpperCase());
    }


}
