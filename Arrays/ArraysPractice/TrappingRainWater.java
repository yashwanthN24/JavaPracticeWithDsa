package Arrays.ArraysPractice;

public class TrappingRainWater {
    public static int gettrappedwater(int height[]) {
        // calculate left max boundary or height of bar -using leftmax array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // calculate right max boundary or height of bar - using rightmax array 
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        
        int trappedwater = 0 ; 
        // now iterate through each bar of height array 
        // to find 
        for (int i = 0; i < height.length; i++) {
            // water level = min(max leftboundary of current bar , max right boundary of current bar )
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // trappedwater = waterlevel of that bar - height of that bar
            trappedwater += waterlevel - height[i];
        }
        
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(gettrappedwater(height));
    }
}
