
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // insertion in map Time complexity = O(1)
        hm.put("India", 120);
        hm.put("China", 150);
        hm.put("US", 50);

        hm.put("India", 100);

        // HashMaps are unordered Maps in java i.e they dont follow any order i.e the
        // data you add gets stored randomly (never  in the same order u add them)

        System.out.println(hm);

        // Get operation in Map - Time complexity = O(1)

        int population = hm.get("India");
        System.out.println(population);

        // if we give a key that's not present in the HashMap it returns null as the
        // value of get
        // ex is as below

        System.out.println(hm.get("Indonesia"));

        // prints null as there is no key-value pair with name as "Indonesia" in map so
        // returns null as value

        // get gives null value for wrong key 

        // ContainsKey - checks if map contains key returns if contains else false 
        //  Time complexity = O(1)
        System.out.println(hm.containsKey("India"));// true 
        System.out.println(hm.containsKey("Indonesia")); // false 

        // remove 
        // if we pass key it will delete/ remove the key value pair if present in hashmap and returns the value of that key 
        // if key not present in map it returns null 

        System.out.println(hm.remove("India"));
        System.out.println(hm);
        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);

        // size -returns  total number of key-value pairs in hashmap 
        System.out.println(hm.size());

        System.out.println(hm.isEmpty());
        // clears the hashmap clear()
        // hm.clear();

        System.out.println(hm);

        // isEmpty - returns true if no key valued  pairs present in hashmap else false 

        System.out.println(hm.isEmpty());

        // iterating through the keys through keyset  (prefer this more )
        Set<String> keys = hm.keySet();

        // here also keys are unordered they follow random order not specifically the order of keys in map 
        System.out.println(keys);
        for (String k : keys) {
            System.out.println(k + "  ,  " + hm.get(k));
        }

        System.out.println();

        // Iterate through EntrySet 
        iterateonHashmap(hm);

    }
    
    public static void iterateonHashmap(HashMap<String , Integer> hm) {
        for (Entry<String, Integer> a : hm.entrySet()) {
            System.out.println(a.getKey() + " , " + a.getValue());
        }
    }
}

