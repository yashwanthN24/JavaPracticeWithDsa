package Recursion;

public class FirstoccurenceOfelementinArray {

    public static int FirstOccurence(int arr[], int key, int index) {
        // check if we reached end of array ,i.e index == arr.length then return -1 
        // -1 indicating no element found 

        if(index == arr.length )
            return -1;
        // check if key element is found at some index if found return the index 
        if(arr[index] == key)
            return index;
        // else keep iterating the array elements by incrementing the index recursively and return the index returned by those calls 
        return FirstOccurence(arr, key, index + 1);

    }
    public static void main(String[] args) {
        int arr[] = { 8, 3, 1, 2, 5, 6, 7, 5 };
        // recursive method 
        System.out.println(FirstOccurence(arr , 5 , 0));
        //  iterative method (normal method )
        int key = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("index is  : " + i);
                break; 
            }

        }
        // else print index not found i.e -1 ;
    }
}
