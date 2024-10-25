package com.example;
/**
 * Represents a matrix with integer elements.
 * This class provides functionality to create a matrix and retrieve its data.
 */
public class Matrix {
    private int[][] data;

    /**
     * Constructs a new Matrix with the specified data.
     * @param data the 2D array representing the matrix
     * @throws IllegalArgumentException if the data is null, empty, or has empty rows
     * @throws ArithmeticException if any element is out of the int range
     */
    public Matrix(int[][] data) {
        if (data == null || data.length == 0 || data[0].length == 0) {
            throw new IllegalArgumentException("Matrix cannot be empty.");
        }
        for (int[] row : data) {
            for (int element : row) {
                if (element < Integer.MIN_VALUE || element > Integer.MAX_VALUE) {
                    throw new ArithmeticException("Overflow: matrix element out of int range.");
                }
            }
        }
        this.data = data;
    }

    /**
     * Returns the data of the matrix.
     * @return a 2D array representing the matrix data
     */
    public int[][] getData() {
        return data;
    }
}
