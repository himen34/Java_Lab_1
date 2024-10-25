package com.example;
/**
 * The main application class for executing matrix operations.
 * This class contains the main method to demonstrate matrix multiplication and the sum of maximum elements.
 */
public class MatrixApplication {

    /**
     * The entry point of the application.
     * This method initializes matrices, performs operations, and prints results.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
            };
            int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
            };

            Matrix matrixA = new Matrix(A);
            Matrix matrixB = new Matrix(B);
            
            System.out.println("Matrix A:");
            MatrixOperations.printMatrix(matrixA);
            System.out.println("\nMatrix B:");
            MatrixOperations.printMatrix(matrixB);

            Matrix matrixC = MatrixOperations.multiply(matrixA, matrixB);
            System.out.println("\nResult of matrix multiplication (C = A * B):");
            MatrixOperations.printMatrix(matrixC);

            int sumMaxElements = MatrixOperations.sumMaxElementsInEachColumn(matrixC);
            System.out.println("\nSum of the largest elements in each column of matrix C: " + sumMaxElements);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
