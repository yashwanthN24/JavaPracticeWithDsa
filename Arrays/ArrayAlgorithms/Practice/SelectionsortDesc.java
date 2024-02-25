package Arrays.ArrayAlgorithms.Practice;

public class SelectionsortDesc {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void selectionsortdesc(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxpos]) {
                    maxpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxpos];
            arr[maxpos] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        selectionsortdesc(arr);
        printArray(arr);
    }
}
