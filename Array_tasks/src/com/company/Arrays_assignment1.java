package com.company;

public class Arrays_assignment1 {
    public static int[] myArr = {5, 3, 7, 6, 2, 8};

    public static void printArrayForLoop() {
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }

    public static void printArrayForEachLoop() {
        for (int i : myArr) {
            System.out.println(i);
        }
    }

    public static void printArrayWhileLoop() {
        int i = 0;
        while (i < myArr.length) {
            System.out.println(myArr[i]);
            i++;
        }
    }

    public static void printArrayDoWhileLoop() {
        int i = 0;
        do {
            System.out.println(myArr[i]);
            i++;
        } while (i < myArr.length);
    }

    public static void main(String[] args) {
        System.out.println("First method, using For Loop:");
        printArrayForLoop();
        System.out.println("The second method, using For each Loop");
        printArrayForEachLoop();
        System.out.println("The third method, using while Loop");
        printArrayWhileLoop();
        System.out.println("The fourth method, using Do While Loop");
        printArrayDoWhileLoop();
        System.out.println("Conclusion: For this assignment the best is For each Loop, because it has less code.");
    }
}
