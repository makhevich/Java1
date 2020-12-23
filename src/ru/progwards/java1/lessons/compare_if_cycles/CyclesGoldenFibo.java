package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static final double GMIN  = 1.61703d;
    public static final double GMAX  = 1.61903d;

    public static boolean containsDigit(int number, int digit) {
        if (number == digit) {
            return true;
        }
        while (number > 0 ) {
            int buff = number % 10;
            if (buff == digit) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static int fiboNumber(int n) { // Здесь мы получаем число из ряда Фибаначи
        int firstNumber = 0;
        int secondNumber = 1;
        int buff = 0;
        for (int i = 1; i < n; i++) {
            buff = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = buff;
        }
        if (buff == 0)
            return 1;
        else
            return buff;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) { // Здесь мы находим золотой треугольник
        double aSide = (double) a;
        double bSide = (double) b;
        double cSide = (double) c;
        double rib = 0; // это ребро
        double footing = 0; // это основание
        if (!TriangleInfo.isIsoscelesTriangle (a, b, c)) {
            return false;
        }
        if (a == b) {
            footing = cSide;
            rib = aSide;
        }
        if (b == c) {
            footing = aSide;
            rib = cSide;
        }
        if (c == a) {
            footing = bSide;
            rib = cSide;
        }
        if (rib/footing >= GMIN && footing/rib <= GMAX) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.print(fiboNumber(i) + " ");
        }
        System.out.println(isGoldenTriangle(89, 89, 144));
        System.out.println(containsDigit(45679, 0));
        System.out.println(TriangleInfo.isIsoscelesTriangle (55, 55, 34));
    }
}