package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_assignment3 {
    public static byte[] byteArray = new byte[10];
    public static Scanner input = new Scanner(System.in);
    public static byte element;


    public static int studentsFailed() {
        int counter = 0;
        for (int i : byteArray) {
            if (i < 4) {
                counter++;
            }
        }
        return counter;
    }

    public static int studentsGotA() {
        int counter = 0;
        for (int i : byteArray) {
            if (i == 10) {
                counter++;
            }
        }
        return counter;
    }

    public static void histogram() {
        int[] grades = new int[11];
        int counter = 0;
        String text = "";
        for (int i = 0; i < grades.length; i++) {
            counter = 0;
            for (int j = 0; j < byteArray.length; j++) {
                if (i == byteArray[j]) {
                    counter++;
                }
            }
            grades[i] = counter;
        }
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i] + " students with the grade " + i);
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter ten array elements!");
        for (int i = 0; i < byteArray.length; i++) {

                System.out.println("Please enter element: ");
                while (!input.hasNextByte()) {
                    System.out.println("That's not a number!");
                    input.next();
                }

                element = input.nextByte();
                if ((element <= 10 && element >= 0)) {
                    byteArray[i] = element;
                } else {
                    i--;
                    System.out.println("Please, enter valid value!");
                }
            }
            System.out.println(Arrays.toString(byteArray));
            System.out.println(studentsFailed() + " students failed, but " + studentsGotA() + " students got A!");
            histogram();
        }
    }
