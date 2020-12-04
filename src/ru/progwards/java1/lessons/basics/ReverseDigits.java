package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        Integer result1 = number % 10; // нашли последнее число
        Integer result2 = number / 100; // нашли первое число
        Integer result3 = number / 10; // ищем среднее число
        Integer result4 = result3 % 10; // ищем среднее число
        String fistNumber = result1.toString();
        String secondNumber = result4.toString();
        String thirdNumber =  result2.toString();
        String result = fistNumber + secondNumber + thirdNumber;
        return Integer.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(789));
    }
}
