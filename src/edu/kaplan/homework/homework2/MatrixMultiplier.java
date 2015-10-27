package edu.kaplan.homework.homework2;

public class MatrixMultiplier {
    public static void main(String[] args) {
        int [][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };
        int[][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };
        int n = first.length;
        int [][] result = new int[n][n];
        for(int i=0; i < n; i++) {  //formation of lines
            for (int j = 0; j < n; j++) {  //formation of column
                for (int k = 0; k <= n; k++) {
                    result[i][j] += first[i][k] * second[k][j]; // calculation element
                }
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
