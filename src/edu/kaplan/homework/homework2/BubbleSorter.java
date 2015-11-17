package edu.kaplan.homework.homework2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 6, 4, 100, 34, 56,7, 7, 9, 32, 74};
        for (int index = 0; index < array.length; index++) {
            for (int curIndex = index + 1; curIndex < array.length; curIndex++) {
                if (array[index]>array[curIndex]) {
                    int temp = array[index];
                    array[index] =  array[curIndex];
                    array[curIndex] = temp;


                }
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
