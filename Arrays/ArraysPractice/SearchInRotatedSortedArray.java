package Arrays.ArraysPractice;

// There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot  
// index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],
//    ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).  
//  For   example, [0,1,2,4,5,6,7] might        be        rotated        at  pivot index 3   
// and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, 
// returnthe index oftarget if it is in nums, or -1   
// if it is not in nums.You must write an algorithm with O(log n) 

public class SearchInRotatedSortedArray {
    public static int searchinrotatedsortedArraywithelementas(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            // if mid on L1 
            if (arr[low] <= arr[mid]) {
                // left side of mid on l1 case 
                if (arr[low] <= key && key <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // case right of L2 
                if (arr[mid] <= key && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(searchinrotatedsortedArraywithelementas(arr , 0));
    }
}
// time complexity is O(log n)