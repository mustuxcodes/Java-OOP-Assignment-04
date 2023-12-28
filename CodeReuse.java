import java.util.Arrays;

public class CodeReuse {
    
    /* Question no 2
     */
    public static void sortDescending(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

//Question 4 


public static double[] calculateStatistics(int[] array) {
    Arrays.sort(array);
    double[] stats = new double[4];
    stats[0] = calculateMedian(array);
    stats[1] = calculateVariance(array);
    stats[2] = Math.sqrt(stats[1]); // Standard Deviation
    stats[3] = calculateSumOfSquares(array);
    return stats;
}

private static double calculateMedian(int[] array) {
    int middle = array.length / 2;
    if (array.length % 2 == 1) {
        return array[middle];
    } else {
        return (array[middle - 1] + array[middle]) / 2.0;
    }
}

private static double calculateVariance(int[] array) {
    double mean = Arrays.stream(array).average().orElse(Double.NaN);
    return Arrays.stream(array)
                 .mapToDouble(num -> Math.pow(num - mean, 2))
                 .average().orElse(Double.NaN);
}

private static double calculateSumOfSquares(int[] array) {
    return Arrays.stream(array)
                 .mapToDouble(num -> num * num)
                 .sum();
}

//Question 6 

public static int[][] matrixMultiplication(int[][] matrixA, int[][] matrixB, int rowsA, int columnsA, int columnsB) {
    int[][] product = new int[rowsA][columnsB];
    for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < columnsB; j++) {
            for (int k = 0; k < columnsA; k++) {
                product[i][j] += matrixA[i][k] * matrixB[k][j];
            }
        }
    }
    return product;
}
}
