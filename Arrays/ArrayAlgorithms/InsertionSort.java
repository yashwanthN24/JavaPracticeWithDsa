package Arrays.ArrayAlgorithms;

public class InsertionSort {
    public static void insertionsort(int arr[]) {
        // we start from the unsorted part that is from index 1
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int prev = i - 1;
            // backtrack through sorted part and make place for the current element to be places at right place
            while (prev >= 0 && arr[prev] > cur) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = cur;

        }
    }
    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 12, 6, 67 };
        insertionsort(arr);
        printArray(arr);
    }
}
