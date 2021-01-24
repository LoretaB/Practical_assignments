package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment2 {

    public static boolean programmaiJastrada = true;

    public static int userInput() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter time in range from 0 to 24: ");
        return userInput.nextInt();
    }

    public static void whatTime(int time) {
        if (time <= 12 && time > 0) {
            System.out.println("Good Morning Sunshine!");
            programmaiJastrada = false;
        } else if (time >= 13 && time <= 19) {
            System.out.println("Good Afternoon. Work Hard!");
            programmaiJastrada = false;
        } else if (time >= 20 && time <= 24) {
            System.out.println("Good evening. Get some rest!");
            programmaiJastrada = false;
        } else {
            System.out.println("Value is not correct! Please, input value in range from 0 to 24!");
        }
    }

    public static void main(String[] args) {

        while (programmaiJastrada) {
                int time = userInput();
                whatTime(time);
        }
    }
}
