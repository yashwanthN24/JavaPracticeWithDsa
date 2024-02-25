package Arrays.ArrayAlgorithms.Practice;

public class InsertionsortDesc {

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void insertionsortdesc(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int prev = i - 1;
            // backtrack and place it in right position 
            while (prev >= 0 && arr[prev] < cur) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = cur;

        }
    }
        
    
    
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        insertionsortdesc(arr);
        printArray(arr);
    }
}
