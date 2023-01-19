package org.example;

import java.util.ArrayList;

public class ZP {

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
        }

        public static void main(String[] args) {
            initEmployees();
            paySalary("Гвинно");
            System.out.println(waitingEmployees);
        }

        public static void paySalary(String name) {
            if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
                alreadyGotSalaryEmployees.add(name);
                for (int i = 0; i < waitingEmployees.size(); i++) {
                    if (waitingEmployees.get(i) != null && waitingEmployees.get(i).equals(name)) {
                        waitingEmployees.set(i, null);
                        break;
                    }
                }
            }
        }
    }


