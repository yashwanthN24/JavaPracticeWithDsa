package Arrays.ArrayAlgorithms;

public class SelectionSort {
    public static void Selectionsort(int arr[]) {
        // turns or passes = n-2
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            //finding the minelement position in the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minpos]) {
                    minpos = j;
                }
            }
            // swap minimum element with starting of sorted array 
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;

        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 34, 12, 4 };
        Selectionsort(arr);
        printArray(arr);
    }
}
