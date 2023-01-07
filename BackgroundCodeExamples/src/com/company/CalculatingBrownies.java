package com.company;

public class CalculatingBrownies {
    public static int calculateBrowniePoints(String customerName, int points) {
        System.out.println("Client, " + customerName + " has received " + points + " points");
        return points * 1000;
    }

    public static int calculateBrowniePoints(int points) {
        System.out.println("Unnamed client has received " + points + " points");
        System.out.println();
        return points * 1000;
    }

    public static int calculateBrowniePoints() {
        System.out.println("No client, no points");
        return 0;
    }
}
