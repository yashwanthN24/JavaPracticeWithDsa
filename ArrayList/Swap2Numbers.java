package ArrayList;

import java.util.ArrayList;

public class Swap2Numbers {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1); // simliar to temp = arr[idx1]
        list.set(idx1, list.get(idx2));// similiar to arr[idx1] = arr[idx2]
        list.set(idx2, temp);// similiar to arr[idx2] = temp 
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println("Before swap");
        System.out.println(al);

        swap(al, 2, 4);
        System.out.println("After swap");
        System.out.println(al);
    }
}
