package org.example;

public class Сomparisons {
    public static void main(String[] args) {
    compare('а', 'а');
    compare('c', 'б');
    compare('р', 'в');
    compare('ы', 'ы');
}

    public static void compare(char first, char second) {
        if (first == second) {
            System.out.println("равны");
        } else if (first > second) {
            System.out.println("больше");
        } else if (first < second) {
            System.out.println("меньше");
        } else {
            System.out.println("А как такое может быть???");
        }
    }


}
