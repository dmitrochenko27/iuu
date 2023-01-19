package org.example;

import java.util.ArrayList;

public class Zaszdsf {
    private static int g = 0;
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
        print();
    }

    public static void main(String[] args) {
        initEmployees();
//        paySalary("Нифрод");
//        paySalary("Иногрим");
        paySalary(waitingEmployees);
        paySalary("Jonny");
    }

    private static void print() {
        System.out.println("Проход №" + g++);
        System.out.println("waitingEmployees: " + waitingEmployees);
        System.out.println("alreadyGotSalaryEmployees: " + alreadyGotSalaryEmployees);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    public static void paySalary(ArrayList<String> employees) {
        for (int i = 0; i < employees.size(); i++) {
            paySalary(employees.get(i));
        }
    }

    public static void paySalary(String name) {
        System.out.println("Пытаемся выплатить ЗП: '" + name + "'");
        if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            for (int i = 0; i < waitingEmployees.size(); i++) {
                if (waitingEmployees.get(i) != null && waitingEmployees.get(i).equals(name)) {
                    waitingEmployees.set(i, null);
                    break;
                }
            }
        }
        print();
    }

}
