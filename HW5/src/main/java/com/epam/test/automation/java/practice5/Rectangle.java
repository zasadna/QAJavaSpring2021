package com.epam.test.automation.java.practice5;

public class Rectangle {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this(a, 5);
    }

    public Rectangle() {
        this(4, 3);
    }

    public void setA(double a) {
        if (a > 0) this.a = a;
        else
            throw new IllegalArgumentException();

    }

    public void setB(double b) {
        if (b > 0) this.b = b;
        else
            throw new IllegalArgumentException();
    }

    public double getSideA() {
        return this.a;
    }

    public double getSideB() {
        return this.b;
    }

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return (a + b) * 2;
    }

    public boolean isSquare() {
        return a == b;
    }

    public void replaceSides() {
        double c = a;
        a = b;
        b = c;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
