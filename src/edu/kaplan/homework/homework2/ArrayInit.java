package edu.kaplan.homework.homework2;

import java.util.Arrays;

/**
 * Created by ִלטענטי on 15.11.2015.
 */
public class ArrayInit  {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

    int n=4;
    int [][] array =  {
            {2, 3, 6, 8},
            {4, 6, 1, 0},
            {9, 2, 5, 6},
            {4, 5, 7, 2}
        };

    for (int i=0; i<array.length; i++){
        for (int j=0; j<array.length; j++){
       // array[i][j]=i + j + 2;
            System.out.print( array[i][j] + "\t");
        }
        System.out.println();
    }
        int arAr [][]= Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(arAr));
        int elem =0, r = 0;
        for ( r=0; r < arAr.length; r++) { //column
           /* if ((elem) != (r)) {
                arAr [r][elem] = 1;
            }*/
            System.out.println();
            for ( elem = 0; elem < arAr.length; elem++) //string


                System.out.print(arAr [r][elem] + " ");
        }
        // arAr [][] = Arrays.copyOf(array, array.length);
//for (int k = 0)
    }

}
