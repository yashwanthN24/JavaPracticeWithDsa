package Recursion;

import java.util.Arrays;

public class SortedArrayCheck {
    // Note that we are checking if the array is sorted in ascending order 
    // For descending order just change the condition to arr[i] < arr[i+1] return false 
    public static boolean isSorted(int arr[], int i) {
        // if all elements are checked return true 
        if (i == arr.length - 1) {
            return true;
        }
        // if arr[i] > arr[i+1] then return false i.e not sorted 
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        // recursively check all elements until end of the array and return the final result 
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        // recursive method
        System.out.println(isSorted(arr, 0));

        // iterative method (normal method)
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] < arr[i + 1])) {
                sorted = false;
            }
        }
        if(sorted && isSorted(arr, 0))
            System.out.println(Arrays.toString(arr) + " is sorted ");
        else
            System.out.println(Arrays.toString(arr) + " is not sorted ");
    }
}
