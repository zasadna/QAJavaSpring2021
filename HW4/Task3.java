package com.epam.test.automation.java.practice4;

public class Task3 {
    private Task3() {
    }

    /**
     * <summary>
     * Create function MultArithmeticElements, which determines the
     * multiplication of the first n elements of arithmetic progression of real
     * numbers with a given initial element of progression a1 and progression step
     * t. an is calculated by the formula (an+1 = an + t).
     * Example,
     * For a1 = 5, t = 3, n = 4 multiplication equals to 5*8*11*14 = 6160
     * </summary>
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        if(n<=0){
            throw new IllegalArgumentException();
        }
        int x = a1;
        for (int i = 1; i < n; i++)
            x*=(a1 + t*i);
        return x;
    }
}
