package com.company;

import java.util.Scanner;

public class AttestingPersonalInfo {

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", thank you for your interest.");
        System.out.println("What year were you born? ");
        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed. Please, try again.");
            }
        } while (!validDOB);

        return "You are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }
}
