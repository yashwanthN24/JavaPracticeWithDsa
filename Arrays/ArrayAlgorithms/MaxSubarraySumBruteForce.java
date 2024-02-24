package Arrays.ArrayAlgorithms;

public class MaxSubarraySumBruteForce {
    // brute force method so 3 loops so time complexity O(n^3) so very inefficient code in terms of time but this the basic approach to solve this problem
    public static void printmaxsubarraysum(int array[]) {
        int large_sum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                }
                if (sum > large_sum)
                    large_sum = sum;
            }
        }
        System.out.println("Max sum from all subarrays is " + large_sum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        printmaxsubarraysum(numbers);
    }
}
