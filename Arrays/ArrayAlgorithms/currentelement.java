package Arrays.ArrayAlgorithms;

public class currentelement {
    public static boolean isrepeat(int nums[]) {
        //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
        int start = 0, end = nums.length - 1;
        while (start < end) {
            if(nums[start] == nums[end])
                return true;
            start++;
            
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = { 1, 4, 3, 2 };
        System.out.println(isrepeat(nums));
    }
}
