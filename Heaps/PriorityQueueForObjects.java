package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueForObjects {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        
        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        
        @Override
        public int compareTo(Student s1) {
            return this.rank - s1.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("Abc", 12));
        pq.add(new Student("bang", 2));
        pq.add(new Student("chill", 45));
        pq.add(new Student("XYZ", 23));


        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "  " + pq.peek().rank);
            pq.remove();
        }
        

        // By default Less valued attribute gets highest priority i.e processed in  queue first 

        // to change this default behaviour include Comparator.reversedOrder() in priority queue constructor 
        //  to make highest valued element as highest priority i.e first processed in a queue 

        

    }
}
