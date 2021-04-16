package com.epam.test.automation.java.practice2;

public class Main {
    private Main() {
    }

    /**
     * <For a positive integer n calculate the result value, which is equal to the sum of the odd numbers of n.
     * Example,
     * n = 1234 result = 4
     * n = 246 result = 0
     */
    public static int task1(int value) {

        int res = 0;
        if (value > 0)
            do {
                int n = value % 10;
                if ((n & 1) == 1)
                    res += n;
                value /= 10;
            } while (value > 0);
        else
            throw new IllegalArgumentException();
        return res;
    }

    /**
     * For a positive integer n calculate the result value, which is equal to the amount of the “1” in the binary
     * representation of n.
     * Example,
     * n = 14 = 1110 result = 3
     * n = 128 = 1000 0000 result = 1
     */
    public static int task2(int value) {
        int res = 0;
        if (value > 0)
            while (value != 0) {
                int d = value % 2;
                value /= 2;
                if (d == 1) {
                    res += 1;
                }
            }
        else
            throw new IllegalArgumentException();
        return res;
    }

    /**
     * For a positive integer n, calculate the result value, which is equal to the sum of the first n Fibonacci numbers.
     * Note. Fibonacci numbers are a series of numbers in which each next number is equal to the sum of the two
     * preceding ones: 0, 1, 1, 2, 3, 5, 8, 13... (the value of the fist element in Fibonacci numbers is "0", the values of the second and the third elements are equal to "1", for other elements use the formula F(n)=F(n-1)+F(n-2))
     * Example,
     * n = 8 result = 33
     * n = 11 result = 143
     */
    public static int task3(int value) {
        int res = 0;
        if (value > 0)
            for (int i = 0; i < value; i++) {
                res += getPrevValue(i);
            }
        else
            throw new IllegalArgumentException();
        return res;
    }

    private static int getPrevValue(int value) {
        if (value <= 1)
            return value;
        return getPrevValue(value - 1)
                + getPrevValue(value - 2);
    }
}
