package com.epam.test.automation.java.practice9;

public class Main {
    public static void main(String[] args) throws MatrixException {

        Matrix m1 = new Matrix(new double[2][3]);

        Matrix m2 = new Matrix(new double[4][3]);

        double[][] array1 = {
                {-9,1,0},
                {4,1,1},
                {-2,2,-1}
        };

        double[][] array2 = {
                {3,1,0},
                {3,3.3,1},
                {-2,2,-1}
        };

        double matrix[][] = { { 39, 27, 11, 42 },
                { 10, 93, 91, 90 },
                { 54, 78, 56, 89 },
                { 24, 64, 20, 65 } };

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        Matrix m3 = new Matrix(matrix);




    }
}
