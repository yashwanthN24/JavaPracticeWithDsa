package Arrays.ArrayAlgorithms;

public class MaxSubarraySumPrefixArray {
    public static void printmaxsubarraysum(int array[]) {
        int large_sum = Integer.MIN_VALUE;
        // create a prefix array
        int prefixArray[] = new int[array.length];
        prefixArray[0] = array[0];
        // first element of prefixarray same as first element as the first element sum
        // will be same
        for (int i = 1; i < array.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                // here i denotes our start of our subarray and j is end index of our subarray
                int sum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
                if (sum > large_sum)
                    large_sum = sum;

            }
        }
        System.out.println("The max subarray sum is = " + large_sum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        printmaxsubarraysum(numbers);

    }
}
