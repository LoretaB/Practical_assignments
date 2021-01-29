package com.company;

import java.util.Scanner;

public class Assignment_switch2_1 {
    public static boolean needRepeat = true;

    public static int inputDay() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void countDay(int inputDay) {
        switch (inputDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a working day!");
                needRepeat=false;
                break;
            case 6:
            case 7:
                System.out.println("It is holiday!");
                needRepeat=false;
                break;
            default:
                System.out.println("Please, input valid values from 1 to 7!");
                break;
        }
    }

    public static void main(String[] args) {
        while (needRepeat) {
            System.out.println("Please, enter the day number: ");
            countDay(inputDay());
        }
    }
}
