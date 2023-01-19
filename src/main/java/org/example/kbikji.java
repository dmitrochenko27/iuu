package org.example;

import java.util.Arrays;

public class kbikji {
    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
        System.out.println(arrayList);
    }
}


