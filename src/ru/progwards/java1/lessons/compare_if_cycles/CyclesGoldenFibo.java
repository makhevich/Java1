package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static final double GMIN  = 1.61703d;
    public static final double GMAX  = 1.61903d;

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

        double x = (double) TriangleSimpleInfo.maxSide(a, b, c);
        double y = (double) TriangleSimpleInfo.minSide(a, b, c);
//        double sideA = (double) a;
//        double sideB = (double) b;
//        double sideC = (double) c;
//        double ab = sideA / sideB;
//        double bc = sideB / sideC;
//        double ca = sideC / sideA;
        if (!TriangleInfo.isIsoscelesTriangle (a, b, c)) {
            return false;
        }
        if (x/y >= GMIN && x/y <= GMAX) {
            return true;
        }

//        if (!TriangleSimpleInfo.maxSide)
//        if (ab >= GMIN && ab <= GMAX) {
//            return true;
//        }
//        if (bc >= GMIN && bc <= GMAX) {
//            return true;
//        }
//        if (ca >= GMIN && ca <= GMAX) {
//            return true;
//        }
        return false;

//        return (TriangleInfo.isIsoscelesTriangle (a, b, c) &&
//                ((ab >= GMIN && ab <= GMAX) ||
//                (bc >= GMIN && bc <= GMAX) ||
//                (ca >= GMIN && ca <= GMAX)));
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.print(fiboNumber(i) + " ");
        }
        System.out.println(isGoldenTriangle(89, 67, 55));
        System.out.println(containsDigit(12345, 9));
        System.out.println(TriangleInfo.isIsoscelesTriangle (55, 55, 34));
    }
}