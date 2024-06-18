// import java.util.ArrayList;
// import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };

        // ArrayList Approach
        // ArrayList<Integer> al = new ArrayList<>();

        // for (int i = 0; i < nums.length; i++) {
        // int n = nums[i];
        // if (!al.contains(n)) {
        // al.add(n);
        // }
        // }

        // System.out.println(al);
        // System.out.println(al.size());

        // // Array Approach
        // int res[] = new int[nums.length];
        // for (int i = 0; i < res.length; i++) {
        // res[i] = -1;
        // }
        // int k = 0;
        // for (int i = 0; i < nums.length; i++) {
        // boolean found = false;
        // for (int j = 0; j < k; j++) {
        // if (nums[i] == res[j]) {
        // found = true;
        // break;
        // }
        // }
        // if (!found) {
        // res[k++] = nums[i];
        // }
        // }

        // or
        /*
         * for (int i = 0; i < nums.length; i++) {
         * int j;
         * for (j = 0; j < k; j++) {
         * if (nums[i] == res[j]) {
         * break;
         * }
         * }
         * if (j == k) { // If j equals k, it means the loop completed without finding a
         * match
         * res[k++] = nums[i];
         * }
         * }
         * 
         * for (int i = 0; i < k; i++) {
         * System.out.print(res[i] + " ");
         * }
         */

        // for (int i = 0; i < k; i++) {
        // System.out.print(res[i] + " ");
        // }

        // hashmap approach

        // HashMap<Integer, Integer> hm = new HashMap<>();

        // for (int i = 0; i < nums.length; i++) {
        // if (!hm.containsKey(nums[i])) {
        // hm.put(nums[i], 1);
        // }
        // }

        // System.out.println(hm);
        // System.out.println(hm.size());

        // Easiest Approach - HashSet - O(n)

        // Using Hashing Data Structures like hashmap hashset reduces time complexity by
        // one n factor i.e in this case from O(n^2 )
        // in Brute force to O(n) after using Hashmap or Hashset

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        System.out.println("Ans : " + hs.size());
    }
}
