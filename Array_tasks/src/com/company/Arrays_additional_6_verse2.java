package com.company;

import java.io.File;

public class Arrays_additional_6_verse2 {

    public static void printDiagonals(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || ((i + j) == (arr.length - 1))) {
                    System.out.print(arr[i][j] + "  ");
                }
                else if (i<j||i>j){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] myNumbers = {{1, 2, 3, 4}, {4, 3, 2, 1}, {7, 8, 9, 6}, {6, 5, 4, 3}};
        printDiagonals(myNumbers);
    }
}

