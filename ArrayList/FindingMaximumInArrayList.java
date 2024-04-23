package ArrayList;

import java.util.ArrayList;

public class FindingMaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(12);
        al.add(7);
        al.add(20);

        // Intialize the max value to the smallest value possible 
        int max = Integer.MIN_VALUE;

        // iterating  over each element of the arraylist 
        for (int i = 0; i < al.size(); i++) {
            max = Math.max(max, al.get(i));
        }

        System.out.println("The Maximum element present in ArrayList is : " +  max);
    }
}
