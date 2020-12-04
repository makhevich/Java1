package ru.progwards.java1.lessons.basics;

public class Astronomy {
    final double PI = 3.14;

    public static Double sphereSquare(Double r) {
        double r2 = r*r;
        double result = 4.0 * PI * r2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sphereSquare(6371.2));
    }
}
