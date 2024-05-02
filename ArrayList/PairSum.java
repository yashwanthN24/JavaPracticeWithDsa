package ArrayList;

import java.util.ArrayList;

public class PairSum {

    // brute force approach 
    public static boolean isPairEqualToTarget(ArrayList<Integer> list, int target) {
        // Brute force approach 
        // time complexity : O(n^2)
        // get all pairs

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }

        return false;
    }
    
    public static boolean isPairEqualToTarget2pointerApproach(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        
        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 5;
        
        System.out.println(isPairEqualToTarget(list, target));
        // 2 pointer approach - O(n) Linear time complexity 
        System.out.println(isPairEqualToTarget2pointerApproach(list, target));
    }
}
