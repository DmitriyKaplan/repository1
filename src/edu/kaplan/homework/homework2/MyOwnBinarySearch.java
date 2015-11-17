package edu.kaplan.homework.homework2;

public class MyOwnBinarySearch {
    public static void main(String[] args) {
       int[]array = {1, 4, 7, 10, 11, 13, 15, 17, 18, 19, 22, 30, 48, 49, 66, 69, 72, 89, 94, 97};
        int element = 69;
        int leftIndex = 0;
        int rightIndex=array.length - 1;
      int result = doBinarySearchRecursion(array, element, leftIndex, rightIndex);
        System.out.println("Index of searching element is " + result);
    }
    public static int doBinarySearchRecursion(int[] array, int key, int left, int right) {
        int mid = (right + left) / 2;
        if (left >= right)
            return -1;
        if (array[mid] == key) {
            return mid;
          } else {
            if (array[mid] > key) {
            return doBinarySearchRecursion(array, key, left, mid);
          } else {
            return doBinarySearchRecursion(array, key, mid + 1, right);
          }
        }
    }
}
