package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(7);
        al.add(3);
        System.out.println(al);
        Collections.sort(al);// Ascending order of sorting 
        System.out.println(al);

        Collections.sort(al, Collections.reverseOrder());// Descending order of sorting 
        // 2nd parameter to sort function is Comparator 
        // Comparator is a function that defines the logic for sorting the elements/objects of arraylist (Collection)
        System.out.println(al);

        // sort method is optmised sort algorithm O(nlogn) 
        // so in problems u can directly use sort method in solving a problems
        
    }
}
