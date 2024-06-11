package Heaps;

import java.util.ArrayList;

public class Heaps {

    static class heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {

            // add at the last index of arraylist
            arr.add(data);

            // fix heap

            int x = arr.size() - 1;
            int parentidx = (x - 1) / 2;

            // Time Complexity = O(log n )
            // where n is the no of nodes in the heap 

            // n nodes has log n levels in a Binary Tree 

            // because the number comparsion between child node and its parent will depend only on the number of levels 
            // levels = log n in a binary tree 

            while (arr.get(x) < arr.get(parentidx)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(parentidx));
                arr.set(parentidx, temp);

                // current parent will becomes child for comparison to higher level parent  
                x = parentidx;

                // get new child parent 
                parentidx = (x - 1) / 2;
            }

        }
        
        public int peek() {
            // return min element of min heap which is at zero index in array based implementation of a heap
            return arr.get(0);
        }


        //  i is root index
        private void heapify(int i) {
            int leftidx = 2 * i + 1;
            int rightidx = 2 * i + 2;
            int minidx = i ;
            // leaf nodes case left child and right child will be out of array index
            if (leftidx < arr.size() && arr.get(minidx) > arr.get(leftidx)) {
                minidx = leftidx;
            }

            if (rightidx < arr.size() && arr.get(minidx) > arr.get(rightidx)) {
                minidx = leftidx;
            }

            // swap root with minidx value  only if there is change in heap 

            if (minidx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);
    
                // now call heapify for minidx to fix heap for lower nodes as well if anything has to be fixed
                heapify(minidx);
            }
            

        }

        public int remove() {

            // data is current element at zero index that element is to be deleted
            int data = arr.get(0);

            // Step 1 : 1st and last node swap 
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            // Step 2: remove last node 
            arr.remove(arr.size() - 1);
            // Step 3: Fix the heap i.e heapify
            heapify(0); // 0 as root is at index 0 in arraylist implementation of heap 

            // finally return the data that was removed 
            return data;

        }
        
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        heap h = new heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        // System.out.println(h.arr);
        h.add(1);
        // System.out.println(h.arr);

        // System.out.println(h.peek());

        // System.out.println(h.remove());
        // System.out.println(h.arr);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();

        }
        
        // this is Min heap 
        // same way we can implement max heap as well just < changes to >

        // This is the same priority queue we used before 


        heap pq = new heap();
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(10);
        // System.out.println(h.arr);
        pq.add(1);



        System.out.println();

        // elements removed from min heap are sorted in ascending order 

        // This is called Heap Sort and its Time complexity = O(nlogn)
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
