import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

        // Time complexity = O(n)
        // As we traverse the whole array arr 

        // put , get ,  containsKey , are all O(1) Time complexity 

        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // iterate through arr and add the elements into the map 
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0 ) + 1 );
            // if (hm.containsKey(ele)) {
            //     hm.put(ele, hm.get(ele) + 1);
            // } else {
            //     hm.put(ele, 1);
            // }
        }

        // Check if count > n/3 and print those numbers 
        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                System.out.print(key + " ");
            }
        }
    }
}
