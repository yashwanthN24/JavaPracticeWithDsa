package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };


        // uncomment this to test endtime basis not sorted case i.e sorted on start basis
        // int start[] = { 0, 1, 3, 5, 5, 8 };
        // int end[] = { 6, 2, 4, 7, 9, 9 };



        // end time basis sorted already 

        // if not sorted 
        int activites[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }

        // lameda function : o -> o[2]
        // lameda - shortform of a big function 
        // here used for comparator function 
        // Comparator is an interface for sorting java objects 
        // sorts the activites based on endtime i.e activities[i][2]

        Arrays.sort(activites , Comparator.comparingDouble(o -> o[2]));
        // to track maximum activities that can be selected 
        int maxActivities = 0;

        // ArrayList to store the index of the activity selected 
        ArrayList<Integer> ans = new ArrayList<>();

        // always select 1st activity because it completes fast and we have more time to complete remaining activities 
        maxActivities = 1;
        // added the index of activity selected since A0 selected its index 0 is added to arraylist ans 
        ans.add(activites[0][0]);
        int lastendtime = activites[0][2];

        for (int i = 1; i < end.length; i++) {
            // if starttime of next activity is greater  than or equal last activity end time
            if (activites[i][1] >= lastendtime) {
                // then select current activity  
                maxActivities += 1;
                // added index of current activity selected 
                ans.add(activites[i][0]);
                // now lastendtime is current activity endtime 
                lastendtime = activites[i][2];
            }
        }
        
        System.out.println("maximum activites selected :" + maxActivities);
        // printing what all activites got selected 
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" +  ans.get(i) + " ") ;
        }


        
    }
}
