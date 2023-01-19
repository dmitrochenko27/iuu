package org.example;

import java.util.ArrayList;

public class dgduyf {
    public static void printAnything(ArrayList arrayList) {
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");

        printAnything(arrayList);
    }
}
