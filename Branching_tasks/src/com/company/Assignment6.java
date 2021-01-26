package com.company;

import java.util.Scanner;

public class Assignment6 {

    public static String userInput(String question) {
        Scanner input = new Scanner(System.in);
        System.out.println(question);
        return input.nextLine();
    }

    public static void displayHighScorePosition(String playersName, int positionInTable) {
        System.out.println(playersName + " managed to get into position " + positionInTable + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        int positionInTable;
        if (score >= 1000) {
            positionInTable = 1;
        } else if (score >= 500 && score < 1000) {
            positionInTable = 2;
        } else if (score >= 100 && score < 500) {
            positionInTable = 3;
        } else {
            positionInTable = 4;
        }
        return positionInTable;
    }

    public static void main(String[] args) {
        System.out.println("Hello! Welcome to our high score checking app!");
        boolean goFurther = true;
        while (goFurther) {
            int choice = Integer.parseInt(userInput("What do you want to do next?" + "\n" + "1 Check player's position on the high score table" + "\n" + "2 Exit"));
            if (choice == 1) {
                displayHighScorePosition(userInput("Please, enter player's name: "), calculateHighScorePosition(Integer.parseInt(userInput("Please, enter player's score: "))));
                goFurther = true;
            } else if (choice == 2) {
                System.out.println("Thank you for using our app! Goodbye!");
                goFurther = false;
            } else {
                System.out.println("You entered invalid values! Try again!");
                goFurther = true;
            }
        }
    }
}
