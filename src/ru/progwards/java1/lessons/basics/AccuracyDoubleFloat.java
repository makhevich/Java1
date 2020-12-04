package ru.progwards.java1.lessons.basics;

import static ru.progwards.java1.lessons.basics.Astronomy.PI;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius) {
        double r3 = radius * radius * radius;
        return 4.0 / 3.0 * PI * r3;
    }

    public static float volumeBallFloat(float radius) {
        float pi = 3.14F;
        float r_earth = 6371.2F;
        float r3 = radius * radius * radius;
        return 4.0F / 3.0F * pi * r3;
    }

    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - volumeBallFloat((float) radius);
    }

    public static void main(String[] args) {
        System.out.println(calculateAccuracy(6371.2));
    }

}
