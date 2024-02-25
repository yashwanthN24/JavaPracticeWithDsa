package Arrays.ArrayAlgorithms.Practice;

public class CountingsortDesc {

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void countingsortdesc(int arr[]) {
        // find max element 
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        // create a count array of length max +1 
        int count[] = new int[max + 1];
        // now update count array by iterating orginal array for count of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // now sorting orginal array using count array by iterating count array 
        int j = 0;
        for (int i = count.length-1; i>=0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        countingsortdesc(arr);
        printArray(arr);
    }
}
