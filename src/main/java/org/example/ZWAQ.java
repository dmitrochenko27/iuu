package org.example;

import java.util.Arrays;

public class ZWAQ {

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        int a = 0;
        for (int h : array) {
            array[a] = a++;
//                System.out.println();
            // return a;

        }
        System.out.println(Arrays.toString(array));
    }
}

