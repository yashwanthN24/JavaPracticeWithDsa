package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingProblem {

    static class Job {
        int deadline;
        int profit;
        int id; // 0(A) , 1(B) , 2(C)

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);//descending order sort based on profit 
        // takes 20 and 10 as a and b if returns -1 then first element smaller than second so no swap if it return 1 then it swaps 

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;

            }
        }
        
        System.out.println("maximum jobs = " + seq.size());
        System.out.println("The jobs are : ");
        for (int i = 0; i < seq.size(); i++) {
            System.out.println( " ( " + jobsInfo[seq.get(i)][0]  + " "  + jobsInfo[seq.get(i)][1] + " ) "  );
        }


    }
}
