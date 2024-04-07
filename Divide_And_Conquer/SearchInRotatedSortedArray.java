package Divide_And_Conquer;

public class SearchinrotatedSortedArray {
    public static int search(int arr[], int target, int si, int ei) {
        // base case 
        if(si > ei )
            return -1;
            
        // finding mid 
        int mid = si + (ei - si) / 2;

        // case found direct 
        if (arr[mid] == target)
            return mid;
            
        // mid on L1 
        if (arr[mid] >= arr[si]) {
            // case a : if target is arr[si] <= target <= arr[mid]
            if (arr[si] <= target && target <= arr[mid]) {
                // case left 
                return search(arr, target, si, mid - 1);
            } else {
                // case search right of mid that include right of l1 and l2 full as well so only till ei(end index)
                return search(arr, target, mid + 1, ei);
            }
        }
        // mid on L2 case 
        else {
            // case right 
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                // case of left of mid means includeing L1 full and left of mid of l2 so only si is start index 
                return search(arr , target , si ,  mid -1 );
            }
        }
        

    }
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr , target , 0 , arr.length-1));
    }
}
