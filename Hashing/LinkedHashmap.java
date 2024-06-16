import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        lhm.put("Indonesia", 6);

        // LinkedHashMap preserved the order of insertion of key valued pairs it orders
        // them in the same order as they are inserted

        System.out.println(lhm);

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
