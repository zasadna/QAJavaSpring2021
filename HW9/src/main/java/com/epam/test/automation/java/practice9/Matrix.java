package com.epam.test.automation.java.practice9;

import java.text.DecimalFormat;

public class Matrix {

    private int row;
    private int column;
    private double[][] values;
    private static String excMess = "Incompatible matrix sizes";

    public Matrix(int row, int column) {
        if(row == 0 || column == 0){
            throw new IllegalArgumentException();
        }
        this.row = row;
        this.column = column;
        this.values = new double[row][column];
    }

    public Matrix(double[][] twoDimensionalArray) throws MatrixException {

        if (twoDimensionalArray.length == 0) {
            throw new MatrixException("Array passed with zero number of rows");
        }
        if (twoDimensionalArray[0].length == 0){
            throw new MatrixException("Array passed with zero number of columns");
        }
        row = twoDimensionalArray.length;
        column = twoDimensionalArray[0].length;
        values = new double[row][column];
            for (int i = 0; i < twoDimensionalArray.length; i++) {
                System.arraycopy(twoDimensionalArray[i], 0, values[i], 0, twoDimensionalArray[i].length);
            }
    }

    /**
     * @return Returns the number of rows in a matrix
     */
    public final int rows() {
        return row;
    }

    /**
     * @return Returns the number of columns in a matrix
     */
    public final int columns() {
        return column;
    }

    /**
     * Receiving of standard two-dimensional array out of matrix.
     *
     * @return Standard two-dimensional array
     */
    public double[][] twoDimensionalArrayOutOfMatrix() {
       return values;
    }

    /**
     * Reading of elements via predetermined correct index
     *
     * @param row    number of rows
     * @param column number of columns
     * @return Returns the value of a matrix element <code>[row,column]</code>
     * @throws MatrixException if index incorrect, returns message "Incompatible matrix sizes"
     */
    public double getValue(int row, int column) throws MatrixException {
        if(this.row <= row || this.column <= column ){
            throw new MatrixException(excMess);
        }
        return values[row][column];
    }

    /**
     * Recording value <code>newValue</code> of elements via predetermined correct index <code>[row,column]</code>     *
     *
     * @param row      number of rows
     * @param column   number of columns
     * @param newValue new value of a matrix element
     * @throws MatrixException if index incorrect, returns message "Incompatible matrix sizes"
     */
    public void setValue(int row, int column, double newValue) throws MatrixException {
        if(this.row <= row || this.column <= column ){
            throw new MatrixException(excMess);
        }
        values[row][column] = newValue;
    }

    /**
     * Method of matrix's addition  <code>matrix</code>.
     * Result in the original matrix
     *
     * @param matrix matrix corresponding to the second term
     * @return Returns a new resulting matrix
     * @throws MatrixException if incompatible matrix sizes, returns message "Incompatible matrix sizes"
     */
    public Matrix addition(Matrix matrix) throws MatrixException {
        if(this.row != matrix.rows() || this.column != matrix.columns() ){
            throw new MatrixException(excMess);
        }

        double[][] temp =new double[row][column];
        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++)
                temp[i][j]=this.values[i][j]+matrix.getValue(i,j);
        return new Matrix(temp);
    }

    /**
     * Method of matrix's deduction <code>matrix</code> from original.
     * Result in the original matrix
     *
     * @param matrix matrix corresponding to the subtracted
     * @return Returns a new resulting matrix
     * @throws MatrixException if incompatible matrix sizes, returns message "Incompatible matrix sizes"
     */
    public Matrix subtraction(final Matrix matrix) throws MatrixException {
        if(this.row != matrix.rows() || this.column != matrix.columns() ){
            throw new MatrixException(excMess);
        }

        double[][] temp=new double[row][column];
        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++)
                temp[i][j]=this.values[i][j]-matrix.getValue(i,j);
        return new Matrix(temp);
    }

    /**
     * Method of matrix's multiplication <code>matrix</code>
     * Result in the original matrix
     *
     * @param matrix matrix corresponding to the second factor
     * @return Returns a new resulting matrix
     * @throws MatrixException if incompatible matrix sizes, returns message "Incompatible matrix sizes"
     */
    public Matrix multiplication(final Matrix matrix) throws MatrixException {
       if(this.column != matrix.rows()){
           throw new MatrixException(excMess);
       }

        double[][] temp=new double[row][matrix.columns()];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < matrix.columns(); ++j) {
                for (int k = 0; k < matrix.rows(); ++k)
                    temp[i][j] += this.values[i][k] * matrix.getValue(k,j);
            }
        }

        return new Matrix(temp);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.rows(); i++) {
            for (int j = 0; j < this.columns(); j++) {
                try {
                    if (j != this.columns() - 1) {
                        builder.append(decimalFormat.format(getValue(i, j))).append(" ");
                    } else {
                        builder.append(decimalFormat.format(getValue(i, j)));
                    }
                } catch (MatrixException e) {
                   return e.getMessage();
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}