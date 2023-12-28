CodeReuse Class Documentation

Overview

The CodeReuse class is a collection of utility methods designed for various array and matrix operations. It's an essential part of a Java-based Object-Oriented Programming assignment, demonstrating proficiency in array manipulation, sorting algorithms, and basic statistical computations.

Methods

1. sortDescending
Purpose: Sorts an array of integers in descending order. This method implements a bubble sort algorithm for simplicity and educational purposes.

Usage:

Parameters: int[] array - An array of integers to be sorted.
Returns: This method sorts the array in place and does not return a value.


Example:
int[] myArray = {3, 1, 4, 1, 5, 9};
CodeReuse.sortDescending(myArray);
// The array myArray is now sorted as {9, 5, 4, 3, 1, 1}.


2. calculateStatistics
Purpose: Computes and returns an array of statistical measures - median, variance, standard deviation, and sum of squares - from an input array of integers.

Usage:

Parameters: int[] array - An array of integers for which statistics are to be calculated.
Returns: double[] - An array containing the median, variance, standard deviation, and sum of squares, in that order.


Example:

int[] data = {1, 2, 3, 4, 5};
double[] statistics = CodeReuse.calculateStatistics(data);
// statistics = {3.0 (Median), 2.0 (Variance), 1.41... (Standard Deviation), 55.0 (Sum of Squares)}


3. matrixMultiplication
Purpose: Calculates the product of two matrices using standard matrix multiplication rules.

Usage:

Parameters:
int[][] matrixA - The first matrix.
int[][] matrixB - The second matrix.
int rowsA - The number of rows in matrix A.
int columnsA - The number of columns in matrix A.
int columnsB - The number of columns in matrix B.
Returns: int[][] - The resulting matrix after multiplication.


Example:
int[][] matrixA = {{1, 2}, {3, 4}};
int[][] matrixB = {{2, 0}, {1, 2}};
int[][] product = CodeReuse.matrixMultiplication(matrixA, matrixB, 2, 2, 2);
// product = {{4, 4}, {10, 8}}


Installation and Usage

To utilize the CodeReuse class, include the provided JAR file in your Java project's classpath.
Invoke the methods directly from the CodeReuse class, as shown in the examples.
Contributing

This Project Is Designed For Academic Purposes And Is Currently Not Open For External Contributions. Feedback And Suggestions For Improvements Are Welcome.
