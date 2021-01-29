package com.company;


import java.util.Scanner;

public class Assignment_switch2_3 {
    public static boolean isWorking=true;
    public static int intInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static char charInput() {
        Scanner input = new Scanner(System.in);
        return input.next().charAt(0);
    }

    public static void calculation(int a, int b, char userOption) {
        switch (userOption) {
            case '+':
                System.out.println("The sum of A and B is: " + (a + b));
                break;
            case '-':
                System.out.println("The result of subtraction is: " + (a - b));
                break;
            case '/':
                if (!(b==0)){
                    double result=(double)a/(double)b;
                    System.out.println("The result of dividing is: " + result);
                }else{
                    System.out.println("You can not divide by zero!");
                }
                break;
            case '*':
                System.out.println("The result of multiplication is: " + (a * b));
                break;
            case '%':
                System.out.println("The remainder of A divided by B is: " + (a % b));
                break;
            case 'p':
                System.out.println("The A= " + a + " and B= " + b);
                break;
            case 'b':
                if (a > b) {
                    System.out.println("The first number A is bigger!");
                } else {
                    if (b > a) {
                        System.out.println("The second number B is bigger!");
                    } else {
                        System.out.println("Numbers are equal!");
                    }
                }
                break;
            case 's':
                if(a<b){
                    System.out.println("The first number A is smaller!");
                } else if (b<a){
                    System.out.println("The second number B is smaller!");
                } else {
                    System.out.println("Numbers are equal!");
                }
                break;
            case 'e':
                isWorking=false;
                break;
            default:
                System.out.println("You entered invalid character! Please, try again!");
                break;
        }
    }

    public static void main(String[] args) {

        System.out.println("Please, enter the first variable A: ");
        int a = intInput();
        System.out.println("Please, enter the second variable B: ");
        int b = intInput();
        String next="\n";
        do {
            System.out.println(next+"Please, choose operation:" + next + "+ :sum both elements " + next +
                    "- :do subtraction" + next + "/ :do dividing" + next + "* :do multiplication"
                    + next + "% :get remainder when the first element is divided by the second element"
                    + next + "p :print both elements" + next + "b :verify which element is bigger" +
                    next + "s :verify which element is smaller"+next+"e :exit programme");
            char userOption = charInput();
            calculation(a, b, userOption);
        } while (isWorking);
        System.out.println(next+"Goodbye!");
    }
}

