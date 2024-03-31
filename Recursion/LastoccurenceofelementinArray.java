package Recursion;

public class LastoccurenceofelementinArray {
    public static int Lastoccurence(int arr[], int key, int i) {
        if (i == arr.length)
            return -1;
        int isFound = Lastoccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
    
    public static int Lastoccurence1(int arr[], int key, int i) {
        // traverse from n-1 index to 0 index  
        if(i == -1 || arr[i] == key)
            return i;
        return Lastoccurence(arr, key, i - 1);
        
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 3, 4, 6, 5, 6 };
        int arr[] = { 5, 5, 5, 5 };
        System.out.println(Lastoccurence1(arr, 5, arr.length-1));
        System.out.println(Lastoccurence(arr, 5, 0));
    }
}
