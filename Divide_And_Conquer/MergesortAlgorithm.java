package Divide_And_Conquer;

public class MergesortAlgorithm {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        // base case 
        // if si == ei i.e only single element array then array is sorted so just return 
        if(si >= ei )
            return;
            
        // else find divide the array two halves using the mid value calculated from the formula 
        // 1) mid = (si + ei)/2   
        // or
        // 2) mid = si + (ei - si)/2 
        // prefer the 2nd formula as it avoid integer overflow incase of larger sized arrays 

        // find mid 
        int mid = si + (ei - si) / 2;

        // dividing array into left and right halves based on mid until both halves get sorted i.e an array of single element (base case)

        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        
        // now merge the sorted left and right halves to get the overall sorted array 

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si  + 1];
        int i = si; // iterator to left halve 
        int j = mid + 1; // ierator to right halve 
        int k = 0; // iterator to temp array 

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }


        // for leftover elements of left sorted part 
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for leftover elements of right sorted part 

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy the sorted (temp) array to orginal array (arr)
        // while copying we must copy to orginal array from si of the sorted array not definiitly the 0th indes of arr (common mistake )

        for ( i = si , k = 0 ; k < temp.length; k++ , i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        // array to be sorted 
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        printArr(arr);
        mergesort(arr, 0, arr.length - 1);
        
        printArr(arr);
    }
}
