package Arrays.ArrayAlgorithms;

public class BubbleSort {
    public static void Bsort(int arr[]) {
        // pass or turns  = n-2
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swaps = 0;
            //upto indexes for comparision and swapping 
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
                
            }
            // adding swaps variable was an optimization for the best case when the array is already sorted 
            //  to achieve O(n)
            if (swaps == 0) {
                System.out.println("The array is already sorted");
                return;
            }
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1 , 3 , 4 , 6 , 12};
        Bsort(arr);
        printArray(arr);

    }
}
