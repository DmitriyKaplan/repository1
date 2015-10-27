package edu.kaplan.homework.homework2;

public class MatrixPrinter {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {3, 4, 5, 6},
            {7, 5, 4, 1}
        };
    for (int firstIndex = 0; firstIndex < 3; firstIndex++ ) {
        for (int secondIndex = 0; secondIndex < 4; secondIndex++ ) {
            System.out.print( array[firstIndex][secondIndex] + " ");
        }
        System.out.println();
    }
    }
}
