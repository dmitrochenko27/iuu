package org.example;

import java.util.ArrayList;

public class jhvjhb {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();


        for (int i = 0; i < 10; i++)
            numbers.add(i * 10);


        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + (Integer) numbers.get(i);
        }
        System.out.println(sum);
    }
}
