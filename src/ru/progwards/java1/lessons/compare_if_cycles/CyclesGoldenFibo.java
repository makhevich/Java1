package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static boolean containsDigit(int number, int digit) {
        while (number > 0 ) {
            int buff = number % 10;
            if (buff == digit) {
                return true;
            }
            number = number / 10;
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

        double side1 = (double) a;
        double side2 = (double) b;
        double side3 = (double) c;
        double side1DivideSide2 = side1 / side2;
        double side2DivideSide3 = side2 / side3;
        double side3DivideSide1 = side3 / side1;
        if (TriangleInfo.isRightTriangle(a, b, c))
            return false;
        if ((side1DivideSide2 >= 1.61703 && side1DivideSide2 <= 1.61903) && a == b)
            return true;
        if ((side2DivideSide3 >= 1.61703 && side2DivideSide3 <= 1.61903) && b == c)
            return true;
        if ((side2DivideSide3 >= 1.61703 && side3DivideSide1 <= 1.61903) && c == a)
            return true;
        return false;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.print(fiboNumber(i) + " ");
        }
        System.out.println(isGoldenTriangle(34, 34, 55));
        System.out.println(containsDigit(12345, 9));
    }
}