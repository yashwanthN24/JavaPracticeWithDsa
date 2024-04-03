package Divide_And_Conquer;

public class QuickSortAlgorithm {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int low, int high) {
        // base case if single element or starting index(low ) > ending index(high) just do nothing return 
        if (low >= high)
            return;

        // find the correct position of pivotindex using partition function 
        int pivotindex = partition(arr, low, high);

        // now that pivot is in its right position apply the same logic to left and right part of the array to get the final sorted array 
        quicksort(arr, low, pivotindex - 1); // left side elements before pivot 

        quicksort(arr, pivotindex + 1, high); // right side elements after pivot 

    }
    
    public static int partition(int arr[], int low, int high) {
        
        // pivot element as last element 
        int pivot = arr[high];

        int i = low - 1; // iterator to place the pivot in its right place using swap if curelement < pivot 
        // i is iterator to startingindex - 1 i.e low - 1 

        // traverse the array till n elements or n-1 elements anything is fine   
        for (int j = low; j <= high; j++) {
            // if curelement is less than pivot increment i and swap the values pointed by i and j 
            if (arr[j] <  pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // after traversing all elements less than pivot are kept on left side so now increment i to place the pivot in its right position 
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
        
    }
    public static void main(String[] args) {
        int arr[] = { 6, 3,5 , 9, 5, 2, 8 };
        quicksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
