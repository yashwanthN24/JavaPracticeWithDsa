package ArrayList;

import java.util.ArrayList;

public class Creation {
    public static void main(String[] args) {
        // without generics 
        ArrayList list = new ArrayList();
        list.add("yash");
        list.add(12);

        for (Object obj : list) {
            if (obj instanceof String)
                System.out.println("String is : " + obj);
            else if (obj instanceof Integer)
                System.out.println("Number :" + obj);
        }
        
        // with generics 
        ArrayList<Integer> list2 = new ArrayList<>();

        // adding elements to arraylist O(1)
        // appends the elements to end of the list 
        list2.add(12);
        list2.add(12);
        list2.add(23);
        list2.add(24);

        // adding elements at a particular index 
        // takes O(n) time as some shiting  of elements is required to place this element 

        list2.add(1, 81);

        // printing out arraylist
        System.out.println(list2);

        // get elements at particular index of arraylist using get(int index) methpd of arrraylist object
        // O(1)
        System.out.println("Element at index 2 is :" + list2.get(2));


        // removing / deleting an element at index i O(n)
        // where n is the arraylist length as we have to shift all element to the left to delete the element at index i 

        System.out.println(list2.remove(2));
        System.out.println(list2);

        // set element at particular index to another value 

        // this also take O(n) time as we have to search for the index and the change the value at that index to our newvalue 

        list2.set(2, 10);
        System.out.println(list2);

        // contains - checks if an elements is present in arraylist or not  
        // if present returns true else false 
        // takes O(n) time as it has to iterate the whole arraylist to find the element 

        System.out.println(list.contains("yash"));
        System.out.println(list2.contains(12));
        System.out.println(list2.contains(21));

        
        // Arrays vs ArrayList 
        // Arrays , elements are accessed using the square bracket notation
        // like arr[1]
        // whereas ArrayList elements are accessed using the get method of the arraylist object 
        // like list2.get(index);

        // Arrays the size have to be provided since its fixed size 
        // ArrayList the size need not be provided as it is a dynamic array that can expand or shrink in size 

        // All programs that were written using Arrays can also be done using ArrayList 
        // as they both have the same characteristics 
        // ArrayList is just an Array that is dynamic in nature 

        // just like how we have length property for array objects to get the size of array 
        // we have size() method for the arraylist  objects that returns the size of the arraylist

        System.out.println(list.size()); // return 2 because there are 2 elements in the arraylist list currently

        System.out.println(list2.size()); // returns 4 because there are 4 elements in the arraylist list2 currently

        // iterating arraylist using the size() method 
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();



    }
}
