package LinkedList;

// all method of JCF Ds are optimized so use them in solving problems 
// dont build from scratch in contests and interviews

import java.util.LinkedList;

public class LinkedListInJCF {
    public static void main(String[] args) {
        // creation 
        LinkedList<Integer> ll = new LinkedList<>();
        // adding 
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);
        
        // printing 

        // removing 
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();

        System.out.println(ll);
    }
}
