import java.util.HashMap;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        // TreeMap<String, Integer> tm = new TreeMap<>((o1 , o2) -> o2.compareTo(o1)); //provided a comparator to sort keys in descending order 
        TreeMap<String, Integer> tm = new TreeMap<>(); // default sort is ascending order of keys sorting
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Indonesia", 6);


        // keys are sorted order 
        System.out.println(tm);


        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);

        // Hashmap is unordered key valued pairs 
        // So random order 
        System.out.println(hm);

        
    }
}
