package BackTracking;

public class BackTrackinginArrays {
    // we are given an array of size n and we have to assign each  index of the array to value+1 starting from the value 1 at 0th index 
    // and then  value-2 and print the array after backtracking
    public static void changearray(int arr[], int index, int value) {

        // base case
        if (index == arr.length) {
            printarray(arr);
            return;
        }

        // recursion or work to be done 
        arr[index] = value;
        changearray(arr, index + 1, value + 1); // recursive call for remaining indexes
        arr[index] = arr[index] - 2; // backtracking step 
    }
    
    public static void printarray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changearray(arr, 0, 1);
        printarray(arr);
    }
}
