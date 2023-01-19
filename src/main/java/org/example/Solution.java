package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/*
Сортировка пузырьком
*/

public class Solution {

    //    public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));
    public static int[] numbers = new int[]{56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        Huha.print();
        Huha.sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        Huha.print();
    }

    private static class Huha {



        public static void sort() {
            for (int i = 0; numbers.length - 1 > i; i++) {
                for (int j = 0; j < numbers.length - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
        }

        public static void print() {
            for (int number : numbers) {
                System.out.print(number + "\t");
            }
        }
    }
}

