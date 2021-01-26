package com.company;

import java.util.Scanner;

public class Assignment7 {

    public static double kmInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter km: ");
        return input.nextDouble();
    }

    public static double toMilesPerHour(double kilometersPerHour) {
        long milesPerHour;
        double mph;
        if (kilometersPerHour < 0) {
            System.out.println("You entered invalid value! Please, enter positive values!");
            System.out.print("Your result: ");
            mph = -1;
        } else {
            milesPerHour = (long) (kilometersPerHour * 0.62137);
            mph = milesPerHour;
        }
        return mph;
    }


    public static void main(String[] args) {
        System.out.println(toMilesPerHour(kmInput())+" miles per hour");
    }

}
