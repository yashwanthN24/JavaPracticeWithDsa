// ItineraryForTickets = we shld print the journey possible from all the given tickets

import java.util.HashMap;

public class ItineraryForTickets {

    public static String getStartPoint(HashMap<String, String> tickets) {
        // To - from Mapping map 
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        // checking keys from (from-to) map to (to-from) map 
        // if key not present in (to-from) map then thats the start return it 
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }


        //  this is just for the syntax of this code 
        // in reality for all our  test cases we will get a starting point never a null 

        return null;

    }

    public static void main(String[] args) {
        // Time complexity = O(n)

        // This is the from - to pairs map given 
        // if given as a 2d array then convert it to a map 
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String startingPoint = getStartPoint(tickets);

        
        System.out.print(startingPoint + " ");
        // now shld loop (from - to) map to get the journey through thr startpoint 
        for (String key : tickets.keySet()) {
            System.out.print("-> " + tickets.get(startingPoint));
            startingPoint = tickets.get(startingPoint);
        }


        // or
        // for (int i = 0; i < tickets.size(); i++) {
        //     System.out.print(" -> " + tickets.get(startingPoint));
        //     startingPoint = tickets.get(startingPoint);
        // }
    }
}
