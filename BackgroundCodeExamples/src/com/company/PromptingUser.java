package com.company;

import java.util.Scanner;

public class PromptingUser {

    public static void summingUserCart() {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
//                int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
                System.out.println();
            }

        }
        System.out.println("The sum of all 5 numbers is " + sum);
    }
}