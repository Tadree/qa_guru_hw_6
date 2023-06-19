package ru.jiehk;

public class PracticeWithOperatorsAndDataTypes {

    public static void main(String[] args) {

        System.out.println("Диапазон для типа float: " + Float.MIN_VALUE + " - " + Float.MAX_VALUE);
        System.out.println("Диапазон для типа double: " + Double.MIN_VALUE + " - " + Double.MAX_VALUE + "\n");

        //переполнение
        byte c = 125;
        for (int i = 1; i <= 5; i++) {
            c++;
            System.out.println(c);
        }

        int a = 127;
        double b = 1.5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(++b);
        System.out.println(a++);

        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - четное число");
            }
        }
        int d = 22;
        System.out.println(a > d);
        System.out.println(a < d);
        System.out.println(a <= d);
        System.out.println(a >= d);
        System.out.println(a != d);
        System.out.println(a == d);
        System.out.println(a > d && b == 2.5);
        System.out.println(!(a > d && b == 2.5));
    }
}
