package ru.progwards.java1.lessons.test;

public class Test1 {
    static double fractional(double num) {
        return num % 1;
    }

    static int addAsStrings(int n1, int n2) {
        Integer nn1 = n1;
        Integer nn2 = n2;
        String fistNumber = nn1.toString();
        String secondNumber = nn2.toString();
        String results = fistNumber + secondNumber;
        return Integer.valueOf(results);

    }

    static String textGrade(int grade) {
        if (grade == 0)
            return ("не оценено");
        if (grade >=1 & grade <= 20)
            return("очень плохо");
        if (grade >=21 & grade <= 40)
            return("плохо");
        if (grade >=41 & grade <= 60)
            return("удовлетворительно");
        if (grade >=61 & grade <= 80)
            return("хорошо");
        if (grade >=81 & grade <= 100)
            return("отлично");
        else
            return("не определено");
    }

    static long factorial(long n) {

        long results = 0L;
        for (long i = 0; i <= n; i++) {
        }
        return results;
    }


    public static void main(String[] args) {
//        int i = (int)765.567;
//        System.out.println("Сделаю коммит, запушу в репо: робот, проверяй теперь всё это...");
//        System.out.println(fractional(1.53));
//        System.out.println(i);
//        System.out.println(addAsStrings(1, 2));
//        if (1 > 2 && 5 >= 0)
//            System.out.println("Что-то из этого условия точно верно");
//        else
//            System.out.println("Быть может что-то в этом условии верно, но что-то точно нет");
        System.out.println(factorial(5));
    }
}
