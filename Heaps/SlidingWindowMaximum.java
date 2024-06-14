package Heaps;

import java.util.PriorityQueue;

public class SlidingWindowMaximum {

    static class Pair implements Comparable<Pair> {
        int num;
        int idx;

        public Pair(int num, int idx) {
            this.idx = idx;
            this.num = num;
        }

        @Override
        public int compareTo(Pair p1) {

            // Ascending order 
            // return this.num - p1.num;

            // but we want descending order 
            return p1.num - this.num;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3; // window size = 3
        int res[] = new int[arr.length - k + 1];
        // result array size is n - k + 1 as we will have n-k+1 possible windows for n
        // sized array and k sized window

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // add 1st window 
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().num;

        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res[i - k + 1] = pq.peek().num;

        }
        

        for (int i : res) {

            System.out.print(i + " ");
        }
        System.out.println();

    }
}

/*
 * 
 * Comparable and Comparator are both interfaces in Java used for sorting
 * objects, but they have different use cases:
 * 
 * Comparable: This interface is used when you want to define a natural, default
 * sorting order for objects of a class. When a class implements Comparable, it
 * has to override the compareTo method. This method takes one parameter: the
 * object to be compared with the current object. Here's an example:
 * 
 * public class MyClass implements Comparable<MyClass> {
    private int value;

    @Override
    public int compareTo(MyClass other) {
        return this.value - other.value;
    }
}
 * 
 * Comparator: This interface is used when you want to define multiple different
 * possible sorting orders for objects, or when you want to sort objects of a
 * class that you do not have control over (i.e., you can't modify the class to
 * implement Comparable). A class that implements Comparator must override the
 * compare method, which takes two parameters: the two objects to be compared.
 * Here's an example:
 * 
 * public class MyClassComparator implements Comparator<MyClass> {
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getValue() - o2.getValue();
    }
}
 * 
 * 
 * In your code, you're trying to use compareTo with two parameters, which is
 * incorrect. If you're defining a natural order for Pair objects, use
 * Comparable with one parameter. If you're defining a specific, possibly
 * non-default order, use a Comparator with two parameters.
 * 
 * 
 */
