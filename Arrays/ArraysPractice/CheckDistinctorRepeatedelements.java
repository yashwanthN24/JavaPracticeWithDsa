package Arrays.ArraysPractice;

// Given an integer array nums, return true if any value appears at least 
// twice in the array, and return false if every element is distinct

public class CheckDistinctorRepeatedelements {
    public static boolean checkIfElementAppearsTwice(int nums[]) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        int newArray[] = new int[largest + 1];

        // iterate through nums array and increase the count of nums array in newArray
        for (int i = 0; i < nums.length; i++) {
            newArray[nums[i]]++;
        }

        // iterate through newArray that includes count of each element if count > 1
        // return true else false
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 0)
                continue;
            if (newArray[i] > 1)
                return true;
        }
        return false;
        // time complexity : O(n)
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(checkIfElementAppearsTwice(nums));
    }

    public static boolean alternative(int nums[]){
        for(int i = 0 ; i<nums.length-1 ; i++){
            for(int j = i+ 1 ; j<nums.length ; j++){
                if(nums[j] == nums[i]){
                    return true ;
                }
            }
        }
        return false;
    // but compromise in time O(n^2 )
    }
}
