package com.company;

import java.util.Scanner;

public class Assignment_switch2_2 {

    public static String gradeInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
 public static void gradeOutput(){
        switch(gradeInput().toLowerCase()){
            case "a":
            case "b":
                System.out.println("Perfect!You are so clever!");
                break;
            case "c":
                System.out.println("Good! But You can do better");
                break;
            case "d":
            case "e":
                System.out.println("It is not good! You should study!");
                break;
            case "f":
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Please, input valid exam grade from A to F!");
                break;
        }
 }

    public static void main(String[] args) {
        System.out.println("Please, input your exam grade: ");
        gradeOutput();
    }
}
