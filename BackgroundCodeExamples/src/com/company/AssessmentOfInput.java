package com.company;

import java.util.Scanner;

public class AssessmentOfInput {
    Scanner scanner = new Scanner(System.in);

    public void inputAssessment1() {
        int counter = 1;
        int sum = 0;

        while (counter <= 5) {
            System.out.println("Please, enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                sum += number;
                counter++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }
        System.out.println("The sum of 5 numbers equals " + sum);
    }

    public void inputAssessment2() {
        double min = 0;
        double max = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Please, enter a number, or any character to exit");
            String nextEntry = scanner.nextLine();

            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered.");
        }
    }
}
