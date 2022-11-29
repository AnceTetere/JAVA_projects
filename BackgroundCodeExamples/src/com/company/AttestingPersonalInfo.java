package com.company;

import java.util.Scanner;

public class AttestingPersonalInfo {

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", thankd for your interest.");
        System.out.println("What year were you born? ");
        String dateOfBirth = scanner.nextLine();

        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "You are " + age + " years old";
    }
}

