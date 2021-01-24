package com.company;
import java.util.Scanner;

public class Assignment3 {

    public static void dateRange(int day, int month, int year, int userAnswerFormat){
        if (day<0 || month<0 || year<0){
            System.out.println("Date cannot contain negative values! Please, use positive values!");
        } else if (day>29 && (month==2)) {
            System.out.println("February does not contain more than 28 days usually or 29 days in leap year!");
        } else if (day>30 && (month==4 || month==6 || month==9 || month==11)){
            System.out.println("This month does not contain more than 30 days!");
        } else if (day>31 ){
            System.out.println("Months does not contain more than 31 day!");
        } else if (month>12){
            System.out.println("Year does not contain more than 12 months!");
        } else{
            switch (userAnswerFormat) {
            case 1:
                System.out.print("Your format is " + year + "/" + month + "/" + day);
                break;
            case 2:
                System.out.print("Your format is " + year + "." + month + "." + day);
                break;
        }
        }
    }

    public static void main(String[] args) {

        Scanner dateInput = new Scanner(System.in);
        System.out.print("Please write the day: ");
        int day = dateInput.nextInt();
        System.out.print("Please write the month: ");
        int month = dateInput.nextInt();
        System.out.print("Please write the year: ");
        int year = dateInput.nextInt();
        System.out.print("Please select the date formatting. 1 - YYYY/MM/DD, 2- YYYY.MM.DD: ");
        int userAnswerFormat = dateInput.nextInt();

       dateRange(day,month,year, userAnswerFormat);

    }
}
