package ArrayList;

import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(6);

        mainlist.add(list1);
        mainlist.add(list2);

        System.out.println(mainlist);

        // iterating 2-d ArrayList using normal for loop 
        for (int i = 0; i < mainlist.size(); i++) {
            System.out.println(mainlist.get(i));
        }

        // or 

        for (int i = 0; i < mainlist.size(); i++) {
            var Al = mainlist.get(i);
            // without var we had to provide ArrayList<Integer> as the type 

            for (int j = 0; j < Al.size(); j++) {
                System.out.print(Al.get(j) + " ");
            }
            System.out.println();
        }

        // Using var allows you to declare local variables without explicitly stating the type. 
        // here al is actually of type ArrayList<Integer> 
        // but instead of typing the type we can use the var keyword which identifies the type automatically 

        // iterating 2-d ArrayList through enhanced for loop 
        for (var al : mainlist) {
            System.out.println(al);
        }

    }
}
