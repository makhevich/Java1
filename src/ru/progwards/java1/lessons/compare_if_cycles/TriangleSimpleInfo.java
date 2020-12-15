package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        int results = 0;
        if (a > b || a > c)
            results = a;
        
        if (b > a || b > c)
            results = b;
        
        if (c > a || c > b)
            results = c;
        return results;
    }

    public static int minSide(int a, int b, int c) {
        int result;
        if ((a < b) || (a < c))
            result = a;
        if ((b < a) || (b < c))
            result = b;
        else
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
        System.out.println(maxSide(10, 12, 2));
        System.out.println(minSide(10, 12, 2));
        System.out.println(isEquilateralTriangle(10, 10, 10));
    }

}
