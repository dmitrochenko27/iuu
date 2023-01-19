package org.example;

public class Jony {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students)
            if (student != null) {
                System.out.println(student);
            }
    }

    public static void main(String[] args) {
        Jony rer = new Jony();

        //напишите тут ваш код
        rer.addStudent("Максим Федоренко");
        rer.addStudent("Олег Кесарчук");
        rer.printStudents();
    }
}
