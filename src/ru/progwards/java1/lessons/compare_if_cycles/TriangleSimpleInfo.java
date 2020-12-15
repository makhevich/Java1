package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {

    public static int maxSide(int a, int b, int c) {
        int result = 0;
        if (a >= b && a >= c)
            result = a;
        else if (b >= a && b >= c)
            result = b;
        else if (c >= a && c >= b)
            result = c;
        return result;
    }

    public static int minSide(int a, int b, int c) {
        int result = 0;
        if (a <= b && a <= c)
            result = a;
        else if (b <= a && b <= c)
            result = b;
        else if (c <= a && c <= b)
            result = c;
        return result;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean ifEqual = false;
        if (a == b && a == c)
            ifEqual = true;
        else
            ifEqual = false;
        return ifEqual;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(100, 120, 50));
        System.out.println(minSide(3, 1, 4));
        System.out.println(isEquilateralTriangle(10, 10, 10));
    }

}
