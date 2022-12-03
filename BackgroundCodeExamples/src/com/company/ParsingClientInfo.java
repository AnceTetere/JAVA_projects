package com.company;

public class ParsingClientInfo {
    public static void parsingValuesFromStrings() {
        String numberAsString = "2018.125";
        System.out.println("String number equals " + numberAsString);
        System.out.println("(String number + 1) equals " + (numberAsString + 1));

        double number = Double.parseDouble(numberAsString);
        System.out.println("Parsed number equals to " + number);
        System.out.println("(Parsed number + 1) equals to " + (number + 1));
    }
}
