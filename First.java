package com.epam.test.automation.java.practice2;

public class First {
    public static void main(String[] args) {
        try {
            System.out.println("Value -3, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(-4));
            System.out.println("Value 0, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(0));
            System.out.println("Value 4, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(4));
            System.out.println("Value 7, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(7));
            System.out.println("Value 56, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(56));
            System.out.println("Value 44, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(44));
            System.out.println("Value 99, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(99));
            System.out.println("Value 111, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(111));
            System.out.println("Value 246, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(246));
            System.out.println("Value 1234, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(1234));
            System.out.println("Value 1830, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(1830));
            System.out.println("Value 331370, n calculate the result value, which is equal to the sum of the odd numbers of n = " + Main.task1(331370));

            int value = 5;
            System.out.println("Value 5 from main = " + Main.task2(value));
            if (value > 0) {
                System.out.println("binStr " + value + " = " + Integer.toBinaryString(value));
            }
            System.out.println("Value -4 from main = " + Main.task2(-4));
            System.out.println("Value 14 from main = " + Main.task2(14));
            System.out.println("Value 128 from main = " + Main.task2(128));
            System.out.println("Value 1367 from main = " + Main.task2(1367));
            System.out.println("Value 27947 from main = " + Main.task2(27947));
        } catch (Exception ex) {
        }
        //    System.out.println("Value 3 from main = "+Main.task3(3));

        int N = 8;
        System.out.print(Main.task3(N) + " ");

        System.out.println("Value 8 from main = " + Main.task3(8));
        int N2 = 11;

        System.out.print(Main.task3(N2) + " ");

        System.out.println("Value 11 from main = " + Main.task3(11));
    }
}
