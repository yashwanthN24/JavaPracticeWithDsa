package Arrays.ArrayAlgorithms;

public class binarysearchProgram {
    public static int binarysearch(int array[], int key) {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            //comparisions
            if (array[mid] == key)
                return mid;
            else if (array[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1; 
    }
    public static void main(String[] args) {
        int array[] = { 1, 2, 6, 8, 10 };
        int key = 18;
        System.out.println("The key element is found at index :" + binarysearch(array, key));
    }
}
