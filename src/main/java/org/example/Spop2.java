package org.example;

public class Spop2 {
    public static void main(String[] args) {
        String string = "12.84";
       // static double
        double v = Double.parseDouble(string);
       // double t = Math.round(v);
        System.out.println(Math.round(v));
        //напишите тут ваш код

        Car car1 = new Car();
        car1.setSpeed(10);
        Car.modelName = "qwerty";
        System.out.println(car1);

        Car car2 = new Car();
        car1.equals(car2);
        car2.setSpeed(20);
        Car.modelName = "asdfgh";
        System.out.println(car2);
        System.out.println(car1);
    }
}
