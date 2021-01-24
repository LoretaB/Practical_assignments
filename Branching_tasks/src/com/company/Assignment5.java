package com.company;

import java.util.Scanner;

public class Assignment5 {
    public static boolean hoursCheckRun=true;
    public static int userInputHours() {
        Scanner userInputHours = new Scanner(System.in);
        System.out.println("Enter working hours: ");
        return userInputHours.nextInt();
    }

    public static void hoursCheck(int workingHoursInDay){
        if (workingHoursInDay<0){
            System.out.println("Working hours can not be negative! Please input positive values!");
        } else if (workingHoursInDay>24){
            System.out.println("Working hours can not be more than 24!");
        } else{
            hoursCheckRun=false;
        }
    }

    public static int salaryCalculation(int workingHoursInDay){
        int salary=0;
        if(workingHoursInDay<=8){
            salary = workingHoursInDay * 10;
        } else if (workingHoursInDay>8){
            salary = 80+((workingHoursInDay-8)*15);
        } return salary;
    }

    public static void main(String[] args){
        int workingHoursInDay=0;
        while (hoursCheckRun) {
            workingHoursInDay = userInputHours();
            hoursCheck(workingHoursInDay);
       }
        System.out.println("Your salary is: "+salaryCalculation(workingHoursInDay));
       }
    }

