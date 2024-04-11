package Arrays.ArrayAlgorithms;

public class TrappingRainWaterProblem {
    public static int gettrappedWaterforbarheight(int height[]) {

        // calculate left max boundary - Array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // calculate right max boundary - Array
        int rightmax[] = new int[height.length];
        rightmax[rightmax.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedwater = 0; 
        // inside loop
        
        for (int i = 0; i < height.length; i++) {
            // water level = min(left max boundary , right max boundary )
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // trapped water = water level - height[i]
            trappedwater += waterlevel - height[i];
        }
        
        return trappedwater;

        // time complexity :
        // the whole function depends on the length of height array so if we assume n = height.length i.e depends on the no of bars  
        // time complexity of this code is O(n)
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(gettrappedWaterforbarheight(height));
    }
}
