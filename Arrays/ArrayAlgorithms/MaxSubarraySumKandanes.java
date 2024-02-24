package Arrays.ArrayAlgorithms;

public class MaxSubarraySumKandanes {

    public static void getsmallestNegative(int array[]) {
        int smallest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > smallest)
                smallest = array[i];

        }
        System.out.println("The max Subarray sum is " + smallest);
    }

    public static boolean checknegativeArray(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        if (count == array.length)
            return true;
        else
            return false;
    }

    public static void printMaxSubarraysum(int array[]) {
        // this is the most efficient algorithm to find max subarray sum and very
        // important in interviews
        // time complexity is O(n) as we iterate through all the element of the array
        // O(n) < O(n^2) < O(n^3)
        // hence O(n) is the fastest and effcient algorithm

        int large_sum = Integer.MIN_VALUE, sum = 0;

        // handling the case for all negative numbers in an array where kandales return
        // 0 as per algorithm
        boolean isnegativeArray = checknegativeArray(array);
        if (isnegativeArray) {
            getsmallestNegative(array);
            return;
        }
        // iterate the whole array
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum < 0)
                sum = 0;
            large_sum = Math.max(sum, large_sum);
        }
        System.out.println("The max subarray sum is " + large_sum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        printMaxSubarraysum(numbers);
    }
}
