package com.epam.test.automation.java.practice5;

public class ArrayRectangles {
    private Rectangle[] rectangleArray;

    public ArrayRectangles(int n) {
        if (n > 0) {
            rectangleArray = new Rectangle[n];
        } else throw new IllegalArgumentException();
    }

    public ArrayRectangles(Rectangle... rectangle) {
        if (rectangle != null && rectangle.length > 0) {
            this.rectangleArray = rectangle;
        } else throw new IllegalArgumentException();
    }

    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] == null) {
                rectangleArray[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    public int numberMaxArea() {
        int index = -1;
        double max = 0;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] != null && max < rectangleArray[i].area()) {
                max = rectangleArray[i].area();
                index = i;
            }
        }
        return index;
    }

    public int numberMinPerimeter() {
        int index = -1;
        double min = -1;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] != null && (min < 0 || min > rectangleArray[i].perimeter())) {
                min = rectangleArray[i].perimeter();
                index = i;
            }
        }
        return index;
    }

    public int numberSquares() {
        int count = 0;
        for (Rectangle rectangle : rectangleArray) {
            if (rectangle != null && rectangle.isSquare())
                count++;
        }
        return count;
    }
}
