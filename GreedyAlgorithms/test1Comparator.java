package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class test1Comparator {
public static void main (String[] args){
ArrayList<Person> list = new ArrayList<Person>();
list.add (new Person("Aman", 34));
list.add (new Person("Akbar", 42));
list.add(new Person("Anthony", 28));

// 2nd way : based on comparator property
Comparator<Person> comparator = Comparator.comparing(o -> o.age);
// 1st way : Collections.sort (list , (obj1 , obj2) -> obj2.age - obj1.age); this is called custom comparator defined as lameda function 
Collections.sort(list, comparator.reversed());


// 3rd way  and define(override) the compareTo() method for the class ur comparing object off  
// Collections.sort(list);
System.out.println (list);
}
}

class Person { //implements Comparable<Person>{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
    * This function compares 2 objects
    * A person object is passed as an argument
    * and returns negative integer, zero, or a positive integer
    * as this object is less than, equal to, or greater than the specified object.
    */
    // @Override
    // public int compareTo(Person person){
    // if(this.age == person.age)
    // return 0;
    // else
    // return (this.age > person.age) ? -1 : 1;
    // }
    @Override
    public String toString() {
        return this.name + ":" + this.age;
    }
}


// swaps only if comparator return 1 
// -1 means no swap 
// for 1st way


