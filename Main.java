package com.epam.test.automation.java.practice1;

public class Main {

    private Main() {
    }

    /**
     * <summary>
     * Task 1:
     * For a given integer n calculate the value which is equal to a:
     * • squared number, if its value is strictly positive;
     * • modulus of a number, if its value is strictly negative;
     * • zero, if the integer n is zero.
     * Example,
     * n = 4 result = 16
     * n = -5 result = 5
     * n = 0 result = 0
     * </summary>
     */

    public static int task1(int n) {
        if (n>0){
            n = n*n;
         }

        if (n<0){
         n = Math.abs(n);
        }

        if (n==0){
         n = 0;
        }
        return n;
    }

    /**
     * <summary>
     * Task 2.
     * Find the maximum integer, that can be obtained by permutation of
     * numbers of an arbitrary three-digit positive integer n (100<=n<=999).
     * Example,
     * n = 165 result = 651
     * </summary>
     */
    public static int task2(int n) {
        int a1 = n/100;
        int a2 = (n/10)%10;
        int a3 = n%10;

        System.out.println("a1 = "+a1);
        System.out.println("a2 = "+a2);
        System.out.println("a3 = "+a3);

        int [] array = {a1,a2,a3};

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("array = "+array[0]+array[1]+array[2]);
        int f1 = array[0]*100;
        int f2 = array[1]*10;
        int f3 = array[2]*1;

        n=f1+f2+f3;

        System.out.println("int test = "+n);

        return n;
    }

}
