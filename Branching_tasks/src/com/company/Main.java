package com.company;

import java.util.Scanner;

public class Main {

    static void taskOne (short a, short b){
        if(a>b){
            System.out.println("Variable a is the largest!");
            System.out.println("Variable b is the smallest!");
        } else if(b>a){
            System.out.println("Variable b is the largest!");
            System.out.println("Variable a is the smallest!");
        } else {
            System.out.println("Variables are equal!");
        }
        if((a%2==0) || (b%2==0)){
            System.out.println("There are variables, that are even!");
        }
        if(!(a%2==0) || (!(b%2==0))){
            System.out.println("There are some variables, that are odd!");
        }
        if(a>0 || b>0){
            System.out.println("There are variables, that are positive!");
        }
        if((a<0) || (b<0)){
            System.out.println("There are variables, that are negative!");
        }
        if(a<100 || b<100){
            System.out.println("There are variables, which are less than 100!");
        }
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first number: ");
        short a=number.nextShort();
        System.out.println("Enter second number: ");
        short b=number.nextShort();
taskOne(a,b);
    }
}
