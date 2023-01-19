package org.example;

import java.util.List;
import java.util.ArrayList;

public class UniversityGroup {

        public List<String> students;

        public UniversityGroup() {
            students = new ArrayList<>();
            students.add("Сергей Фрединский");
            students.add("Виталий Правдивый");
            students.add("Максим Козыменко");
            students.add("Наталия Андрющенко");
            students.add("Ира Величенко");
            students.add("Николай Соболев");
            students.add("Снежана Слободенюк");
        }

        public void exclude(String excludedStudent) {
            students.removeIf(students -> students.equals(excludedStudent));
         //   List<String> copy = new List<String>(students);

//            for (int i = 0; i < students.size() ; i++) {
//                if (students.get(i).equals(excludedStudent)) {  //if (students.get(i).equals(excludedStudent))
//                    students.remove(i);
//                }
//            }
        }

        public static void main(String[] args) {
            UniversityGroup universityGroup = new UniversityGroup();
            universityGroup.exclude("Виталий Правдивый");
            universityGroup.students.forEach(System.out::println);
        }
    }

