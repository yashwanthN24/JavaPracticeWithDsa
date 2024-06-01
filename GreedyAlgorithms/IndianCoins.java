package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };


        // sorting the notes/coins dominations in descending order 
        
        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;
        int copyofamount = amount;

        // ArrayList to store the coins/notes choosen 

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            // if current note is less than or equal to amount 
            if (coins[i] <= amount) {
                // then how many times we have to use this amount till its less than the amount 
                while (coins[i] <= amount) {
                    countOfCoins++;
                    al.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Total (min) coins used = " + countOfCoins);
        // print the coins used as well 

        System.out.println("The coins/notes used for " + copyofamount + " are : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }

        // here greedy approach is that if we have amount 2000 we directly give 1  2000 note and we don't give 4 500 notes 

        // Time complexity : O(nlogn) as we are sorting 
    }


}
