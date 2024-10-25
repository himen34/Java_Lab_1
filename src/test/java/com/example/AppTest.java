package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixOperationsTest {

    @Test
    void testMatrixMultiplication() {
        int[][] dataA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] dataB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        int[][] expectedData = {
            {58, 64},
            {139, 154}
        };

        Matrix matrixA = new Matrix(dataA);
        Matrix matrixB = new Matrix(dataB);
        Matrix resultMatrix = MatrixOperations.multiply(matrixA, matrixB);

        assertArrayEquals(expectedData, resultMatrix.getData(), "Matrix multiplication result is incorrect.");
    }

    @Test
    void testSumMaxElementsInEachColumn() {
        int[][] dataC = {
            {58, 64},
            {139, 154}
        };

        Matrix matrixC = new Matrix(dataC);
        int expectedSum = 139 + 154; // максимальные элементы по каждому столбцу
        int actualSum = MatrixOperations.sumMaxElementsInEachColumn(matrixC);

        assertEquals(expectedSum, actualSum, "Sum of maximum elements in each column is incorrect.");
    }
    
    @Test
void testMatrixMultiplicationInvalidDimensions() {
    int[][] dataA = {
        {1, 2},
        {3, 4}
    };
    int[][] dataB = {
        {5, 6},
        {7, 8},
        {9, 10}
    };

    Matrix matrixA = new Matrix(dataA);
    Matrix matrixB = new Matrix(dataB);

    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        MatrixOperations.multiply(matrixA, matrixB);
    });

    assertEquals("Number of columns in matrix A must match number of rows in matrix B.", exception.getMessage());
}
}
