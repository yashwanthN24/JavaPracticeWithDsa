package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {
    
    public static int getMaxstoredWater(ArrayList<Integer> height) {
        int maxwater = 0; // when only 1 line is there no container water stored is 0 



        // finding pairs of lines to make a container i,e selecting two lines out of n i.e (height.length) lines given
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int heigt = Math.min(height.get(i), height.get(j)); // height = min(height of l1 , height of l2)
                int width = j - i; // index of l2 - index of l1 
                int waterstored = width * heigt;
                maxwater = Math.max(maxwater, waterstored);
            }
        }

        return maxwater;
    }

    public static int getMaxstoredWaterUsing2pointer(ArrayList<Integer> height) {
        
        int maxstoredwater = 0;// when no container can be formed that is single line case waterstored = 0 

        int lp = 0; // left pointer pointing to first line 
        int rp = height.size() - 1; // right pointer pointing to last line 
        
        // we make a container consider lp and rp as the left and right boundaries 

        // we make sure lp != rp or lp > rp as we deal with single line or duplicate container again respectively 
        
        while (lp < rp) {

            //  find width and height of the container 
            // width = index of l2 - index of l1
            int width = rp - lp;

            // height = min(l1 height , l2 height )

            int heiht = Math.min(height.get(lp), height.get(rp));

            // calculate current container stored water area = width * height 
            int curwaterstored = width * heiht;

            // check if its the max stored water and store it in maxstoredwater 

            maxstoredwater = Math.max(maxstoredwater, curwaterstored);

            // move the pointer having smaller height to get maximum size container and hence maximum water 
            if (height.get(lp) < height.get(rp)) {
                // lp pointer height is smaller  so move forward to get a bigger container
                lp++;
            } else {
                // i.e rp height is smaller so move rp forward i.e rp-- to get big container 
                rp--;

            }

        }
        
        return maxstoredwater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);        
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // brute force approach -O(n^2)
        System.out.println(getMaxstoredWater(height));

        // Linear Time complexity - O(n)
        System.out.println(getMaxstoredWaterUsing2pointer(height));



                

    }
}
