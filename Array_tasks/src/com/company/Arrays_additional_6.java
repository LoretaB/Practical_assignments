package com.company;

public class Arrays_additional_6 {

    public static void printPrincipalDiagonal(int[][] arr) {
        System.out.print("Principal Diagonal: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.println("");

    }

    public static void printSecondaryDiagonal(int[][] arr) {
        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) == (arr.length - 1)) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.println("");

    }


    public static void main(String[] args) {
        int[][] myNumbers = {{1, 2, 3, 4}, {4, 3, 2, 1}, {7, 8, 9, 6}, {6, 5, 4, 3}};
        printPrincipalDiagonal(myNumbers);
        printSecondaryDiagonal(myNumbers);
    }
}
