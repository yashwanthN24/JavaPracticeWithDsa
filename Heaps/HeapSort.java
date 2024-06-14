package Heaps;

public class HeapSort {

    public static void heapsort(int arr[]) {
        // step 1 : Build maxheap 
        int n = arr.length;

        // O(n/2 * logn) => O(nlogn)  as constants are ignored in time complexity considerations 
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr , i, n); // O(logn)
        }

        // Step 2 : push largest at end 
        // O(nlogn)
        for (int i = n - 1; i > 0; i--) {
            // swap first element and last element 
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call heapify for 0th index 
            heapify(arr, 0, i);
        }
        

        // so overall time complexity = 2*nlogn i.e O(nlogn) 
        // as constants are ignored in Time complexity considerations
        


    }

    public static void heapify(int arr[]  , int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxidx = i;
        
        if (left < size && arr[maxidx] < arr[left]) {
            maxidx = left;
        }

        if (right < size && arr[maxidx] < arr[right]) {
            maxidx = right;
        }

        if (maxidx != i) {
            int temp = arr[i];
            arr[i] = arr[maxidx];
            arr[maxidx] = temp;

            heapify(arr, maxidx, size);
        }
    }
    public static void main(String[] args) {
        
        int arr[] = { 1, 2, 4, 5, 3 };
        heapsort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

//  for descending order sort just change <  to > in heapify function 

// Time complexity :

