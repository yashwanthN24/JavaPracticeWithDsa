package Arrays.ArrayAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class InBuiltSortInJava {
    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 1, 3, 2, 4 };

        Arrays.sort(arr, 0, 3);
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
        // By default Arrays.sort sorts elements in ascending order
        // to sort in descending order we use Collections Framework
        Integer array[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(array, Collections.reverseOrder());
        // Collections Framework only work with Object types so we need to use only Integer object Array;
        // autoBoxing : Java automatically converts an int to Integer object 
        // unboxing : Java lets you to convert Integer object to int primitive type 
        printArray(array);

        Integer arr2[] = { 12, 50, 98, 3, 4, 1 };
        Arrays.sort(arr2, 0, 3, Collections.reverseOrder());
        printArray(arr2);

        // here that reverseOrder() is internally a comparator 
        

    }
}
