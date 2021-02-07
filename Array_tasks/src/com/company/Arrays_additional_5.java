package com.company;

import java.util.Arrays;

public class Arrays_additional_5 {

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int swapElement = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = swapElement;
        }
    }

    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3, 4, 5};
        System.out.println("Non reversed array: " + Arrays.toString(myNumbers));
        reverse(myNumbers);
        System.out.println("Reversed array: "+ Arrays.toString(myNumbers));
    }
}
