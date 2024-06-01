package GreedyAlgorithms;

import java.util.Arrays;

public class MinimumSumabsolutedifferencePairs {
    public static void main(String[] args) {

        // Time complexity = O(nlogn)
        // as we sorted both the arrays 

        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        Arrays.sort(A);
        Arrays.sort(B);

        int absolutediffSum = 0;
        for (int i = 0; i < A.length; i++) {
            absolutediffSum += Math.abs(A[i] - B[i]);

        }
        System.out.println("Minimum absoulte difference sum :" + absolutediffSum);
        
    }

}
