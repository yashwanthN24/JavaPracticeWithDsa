package Recursion.MorePracticeQuestions;

public class Towerofhanoi {
    public static void towerofhanoi(int n , char src , char dest , char helper) {
        if (n == 1) {
            System.out.println("move" + n + "disk from "  + src  + "to" + dest);
            return;
        }
        
        // move top n-1 disks from source to aux using destination 
        towerofhanoi(n - 1, src, helper, dest);
        System.out.println("move" + n + " disk from" +  src  + "to"  + dest);

        // now move n-2 disks from aux to dest using src 
        towerofhanoi(n-1 , helper, dest, src);
    }
    public static void main(String[] args) {
        towerofhanoi(3, 'A', 'C', 'B');
    }
}
