package edu.kaplan.homework.homework2;


public class MatrixInverter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1},
                {8, 1, 7, 9}
        };
        for (int firstIndex = 3; firstIndex >= 0; firstIndex-- ) {
            for (int secondIndex = 3; secondIndex >= 0; secondIndex-- ) {
                System.out.print( array[firstIndex][secondIndex] + "  ");
            }
            System.out.println();
        }
    }
}