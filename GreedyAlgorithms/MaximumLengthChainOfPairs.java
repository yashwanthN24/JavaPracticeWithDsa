package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthChainOfPairs {

    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        int newPairs[][] = new int[pairs.length][3];

        for (int i = 0; i < pairs.length; i++) {
            newPairs[i][0] = i;
            newPairs[i][1] = pairs[i][0];
            newPairs[i][2] = pairs[i][1];
        }



        Arrays.sort(newPairs, Comparator.comparingDouble(o -> o[2]));
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(newPairs[0][0]);
        int chainLen = 1;
        // int chainEnd = pairs[0][1]; // last selected pair end //chain end 
        int chainEnd = newPairs[0][2]; // last selected pair end //chain end 

        for (int i = 1; i < newPairs.length; i++) {
            if (newPairs[i][1] > chainEnd) {
                chainLen++;
                al.add(newPairs[i][0]);
                chainEnd = newPairs[i][2];
            }
        }

        System.out.println("Maximum length of chain : " + chainLen);

        // This problem also same as Activity selection 

        // if you want to print what all pairs got included in chain 
        // make a new 2D array of [pairs.length][3] to store orginal index , pair->first and pair->last 

        // then sort and add the orginal index to arraylist if that condition inside for loop satisfies in if
        
        // the array list consists the indexes of pairs that are included in the chain 


        // printing pairs included in chain 
        System.out.println("The following pairs are included in chain : ");

        for (int i = 0; i < al.size(); i++) {
            int idx = al.get(i);
            System.out.print( " ( " + pairs[idx][0] + " , " + pairs[idx][1] + " ) ");
        }
    }
}