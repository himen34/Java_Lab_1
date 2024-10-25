package com.example;
/**
 * Utility class for performing operations on matrices.
 * This class provides methods to multiply matrices and calculate the sum of maximum elements in each column.
 */
public class MatrixOperations {
    
    /**
     * Multiplies two matrices A and B.
     * @param matrixA the first matrix
     * @param matrixB the second matrix
     * @return the result of the matrix multiplication
     * @throws IllegalArgumentException if the matrices cannot be multiplied (incompatible dimensions)
     * @throws ArithmeticException if an overflow occurs during multiplication
     */
    public static Matrix multiply(Matrix matrixA, Matrix matrixB) {
        int[][] dataA = matrixA.getData();
        int[][] dataB = matrixB.getData();
        
        if (dataA[0].length != dataB.length) {
            throw new IllegalArgumentException("Number of columns in matrix A must match number of rows in matrix B.");
        }
        
        int[][] result = new int[dataA.length][dataB[0].length];
        
        for (int i = 0; i < dataA.length; i++) {
            for (int j = 0; j < dataB[0].length; j++) {
                for (int k = 0; k < dataB.length; k++) {
                    long product = (long) dataA[i][k] * dataB[k][j];
                    if (product < Integer.MIN_VALUE || product > Integer.MAX_VALUE) {
                        throw new ArithmeticException("Overflow: result out of int range during multiplication.");
                    }
                    result[i][j] += (int) product;
                }
            }
        }
        
        return new Matrix(result);
    }
    
    /**
     * Calculates the sum of the largest elements in each column of the given matrix.
     * @param matrix the matrix to evaluate
     * @return the sum of the largest elements in each column
     */
    public static int sumMaxElementsInEachColumn(Matrix matrix) {
        int[][] data = matrix.getData();
        int sum = 0;
        
        for (int j = 0; j < data[0].length; j++) {
            int max = data[0][j];
            for (int i = 1; i < data.length; i++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
            sum += max;
        }
        
        return sum;
    }
    
    /**
     * Prints the matrix to the console.
     * @param matrix the matrix to print
     */
    public static void printMatrix(Matrix matrix) {
        for (int[] row : matrix.getData()) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
