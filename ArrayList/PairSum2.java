package ArrayList;

import java.util.ArrayList;

public class PairSum2 {

    // time complexity O(n)

    //  2 pointers approach 
    public static boolean  getPairsum2pointer(ArrayList<Integer> list, int target) {
        // finding breakpoint 
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int rp = bp; // rp pointer to largest element's index 
        int lp = bp + 1; // lp pointer to smallest element's index 


        int n = list.size();
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp = (lp + 1) % n;
                // rotated increment to make sure we increment in a rotated fashion 
            } else {
                rp = (n + rp - 1) % n;
                // rotated decrement to make sure we decrement  in a rotated fashion 
            }

        }
        // if no pairs sum to target return false 
        return false; 
    }
    

    public static void main(String[] args) {
        ArrayList<Integer> sortedRotatedList = new ArrayList<>();

        sortedRotatedList.add(11);
        sortedRotatedList.add(15);
        sortedRotatedList.add(6);
        sortedRotatedList.add(8);
        sortedRotatedList.add(9);
        sortedRotatedList.add(10);

        int target = 16;

        System.out.println(getPairsum2pointer(sortedRotatedList , target));


    }
}
