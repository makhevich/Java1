package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static boolean containsDigit(int number, int digit) {
        return number == digit;
    }

    public static int plusTowSide (int a, int b) { // функция для скалдывания данных
        return a + b;
    }

    public static boolean isTriangle(int a, int b, int c) { // Здесь мы выясняем можно ли построить треугольник
        boolean result;
        if (a < plusTowSide(b, c) && b < plusTowSide(a, c) && c < plusTowSide(a, b))
            result = true;
        else
            result = false;
        return result;
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
        boolean result = true;
        double side1 = (double)a;
        double side2 = (double)b;
        double side3 = (double)c;
        double side1DivideSide2 = side1 / side2;
        double side2DivideSide3 = side2 / side3;
        double side3DivideSide1 = side3 / side1;
        if (isTriangle(a, b , c) == true )
            return ((side1DivideSide2 > 1.61703 && side1DivideSide2 < 1.61903) && (side2DivideSide3 > 1.61703 &&
            side2DivideSide3 < 1.61903) && (side3DivideSide1 > 1.61703 && side3DivideSide1 < 1.61903));
        else
            return false;

    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.print(fiboNumber(i) + " ");
        }

//        while () {
//
//        } )
//        System.out.println(fiboNumber(10));
//        System.out.println(isGoldenTriangle(3, 3, 5));
    }
}
