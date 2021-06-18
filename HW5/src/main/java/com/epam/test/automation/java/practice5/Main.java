package com.epam.test.automation.java.practice5;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 5);
        System.out.println(r);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());
        r.replaceSides();
        System.out.println(r);

        Rectangle r2 = new Rectangle();
        System.out.println(r2);
        System.out.println(r2.area());
        System.out.println(r2.perimeter());
        System.out.println(r2.isSquare());
        r2.replaceSides();
        System.out.println(r2);

        Rectangle r3 = new Rectangle(5);
        System.out.println(r3);
        System.out.println(r3.area());
        System.out.println(r3.perimeter());
        System.out.println(r3.isSquare());
        r3.replaceSides();
        System.out.println(r3);

    }
}
