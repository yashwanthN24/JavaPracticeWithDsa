package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col => idx ;
        // 1st col => ratio i.e val[i] / weight[i]

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // now sort them on ratio basis in ascending order 
        // it will sort by ascending order below 
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        
        // but we need ratios in descending order so iterate from backside 
        int capacity = W;
        int maxval = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                // include full item
                maxval += val[idx];
                capacity -= weight[idx];
            } else {
                // include fractional item 
                maxval += ratio[i][1] * capacity;// ratio would have calculated 1kg price of that item and its profit so based on that we select items with maximum 1kg profit 
                capacity = 0;
                break;
            }
        }
        System.out.println("Final maximum profit value = " + maxval);
    }
}
