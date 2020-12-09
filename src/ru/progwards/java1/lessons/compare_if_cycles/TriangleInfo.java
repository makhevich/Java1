package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {

    public static int plusTowSide (int a, int b) { // функция для скалдывания данных
        return a + b;
    }

    public static boolean isTriangle(int a, int b, int c) {
        boolean result;
        if (a < plusTowSide(b, c) && b < plusTowSide(a, c) && c < plusTowSide(a, b))
            result = true;
        else
            result = false;
        return result;
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        boolean result;
        int sideTriangle1 = a * a;
        int sideTriangle2 = b * b;
        int sideTriangle3 = c * c;
        if (sideTriangle1 == (sideTriangle2 + sideTriangle3))
            result = true;
        if (sideTriangle2 == (sideTriangle1 + sideTriangle3))
            result = true;
        if (sideTriangle3 == (sideTriangle1 + sideTriangle2))
            result = true;
        else
            result = false;
        return result;
    }


    public static void main(String[] args) {
        System.out.println(isTriangle(100,10,10));
        System.out.println(isRightTriangle(4,3,4));
    }

}
