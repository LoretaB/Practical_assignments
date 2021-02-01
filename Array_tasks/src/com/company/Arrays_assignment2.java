package com.company;

public class Arrays_assignment2 {
    public static int[] newArr = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

    public static void printNegative() {
        for (int i : newArr) {
            if (i < 0) {
                System.out.println(i);
            }
        }
    }

    public static void printOdd() {
        for (int i : newArr) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void printCountOdd() {
        int counter = 0;
        for (int i : newArr) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        System.out.println("\n In current array " + counter + " elements are odd!");
    }

    public static void multipleElements() {
        int counter = 0;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[i] == newArr[j]) {
                    counter++;
                }
            }
        }
        System.out.println("\n In current array " + counter + " elements are equal!");
    }

    public static void printSecond() {
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i + 1]);
            i++;
        }
    }

    public static void computeAverage() {
        int sum=0;
        for (int i = 0; i < newArr.length; i++) {
            sum=sum+i;
        }
        int average=sum/newArr.length;
        System.out.println("The average value of the array is "+average);
    }

    public static void countBelowAverage() {
        int sum=0;
        for (int i = 0; i < newArr.length; i++) {
            sum=sum+i;
        }
        int average=sum/newArr.length;
        int counter = 0;
        for (int i : newArr) {
            if (i <average) {
                counter++;
            }
        }
        System.out.println("There are "+counter+" elements, that are smaller than average value, which is "+average);
    }

    public static void main(String[] args) {
        System.out.print("In this array negative elements are: \n");
        printNegative();
        System.out.print("In this array odd elements are: \n");
        printOdd();
        printCountOdd();
        multipleElements();
        System.out.print("In this array each second elements are: \n");
        printSecond();
        computeAverage();
        countBelowAverage();
    }
}

