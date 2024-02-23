package Arrays.ArrayAlgorithms;

public class LargestSmallestInarray {
    public static int getlargest(int array[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > large)
                large = array[i];
        }
        return large;
    }

    public static int getsmallest(int array[]) {
        int small = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        return small ;
    }
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 4, 5 };
        System.out.println("largest element in the array is : " + getlargest(numbers));
        System.out.println("Smallest element in the array is :" + getsmallest(numbers));
        //Note : Integer.MAX_VALUE denotes 2^31-1 value the maximum possible value for integer
        // Integer.MIN_VALUE denotes -2^31 denotes the lowest possible value of integer
        
    }
}
