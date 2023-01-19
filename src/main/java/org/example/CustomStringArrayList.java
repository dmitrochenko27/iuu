package org.example;

import java.util.Arrays;

public class CustomStringArrayList {

        private int size;
        private int capacity;
        private String[] elements;

        public CustomStringArrayList() {
            capacity = 10;
            size = 0;
            elements = new String[capacity];
        }

        public void add(String element) {
            if (size == capacity) {
                grow();
            }
            elements[size] = element;
            size++;
        }

    private void grow() {
            capacity *= 1.5;
//            String[] a = Arrays.copyOf(elements, capacity);
        String[] s = new String[capacity];
        for (int i = 0 ; i < elements.length ; i++) {
            s[i] = elements[i];
        }
            elements = s;

            //напиш
            // ите тут ваш код
        }

    @Override
    public String toString() {
        return "CustomStringArrayList{" +
                "size=" + size +
                ", capacity=" + capacity +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    }


