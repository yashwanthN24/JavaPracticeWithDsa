package ArrayList;

import java.util.ArrayList;

public class ExampleFor2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i);
            list2.add(i * 2);
            list3.add(i * 5);
        }
        
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);

        System.out.println();

        for (var list : mainlist) {
            System.out.println(list);
        }
        
        System.out.println();
        // traversing through mainlist to get each arraylist present 
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> al = mainlist.get(i);
            // iterate through the elements of the obtained arraylist 
            for (int j = 0; j < al.size(); j++) {
                System.out.print(al.get(j) + " ");
            }
            System.out.println();
        }

    }
}
