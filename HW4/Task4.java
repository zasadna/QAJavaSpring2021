package com.epam.test.automation.java.practice4;

public class Task4 {
    private Task4() {
    }
    /**
     * <summary>
     * Create function SumGeometricElements, determining the sum of the first
     * elements of a decreasing geometric progression of real numbers with a
     * given initial element of a progression a1 and a given progression step t,
     * while the last element must be greater than a given alim. an is calculated
     * by the formula (an+1 = an * t), 0<t<1 .
     * Example,
     * For a progression, where a1 = 100, and t = 0.5, the sum of the first elements,
     * grater than alim = 20, equals to 100+50+25 = 175
     * </summary>
     */
    public static double sumGeometricElements(int a1, double t, int alim) {
        if (t<=0 || t>=1 || a1 <= alim || a1 <= 0 || alim < 0)
            throw new IllegalArgumentException();

        double sum = a1;
        double an = a1;
        while (an != (an = an*t) && an > alim)
            sum += an;

        return Math.round(sum);
    }
}
