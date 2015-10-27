package edu.kaplan.homework.homework2;

public class YourOwnBinarySearch {
    public static void main(String[] args) {
        int[]array = {1, 4, 7, 10, 17, 22, 30, 48};
        int element =17;
        int n = array.length;
        int rightIndex=n-1, mid = rightIndex / 2;
        do {
            if (element < array[mid]) {
                mid = mid / 2;
               // System.out.println(mid);
            } else {
                if (element > array[mid]) {
                    mid = ((rightIndex + mid +1) / 2);
                   // System.out.println(mid);
                }
            }
        } while (element != array[mid]);
        System.out.println("Index of searching element is " + mid);
    }
}
