package Stack;

import java.util.Arrays;

public class NextGreaterElement {

    static int arr[] = { 6, 8, 0, 1, 3 };

    public static void main(String[] args) {
        // brute force approach 
        int NextGreater[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int temp = -1 ;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    break;
                }
            }
            NextGreater[i] = temp;
        }
        
        System.out.println(Arrays.toString(NextGreater));
    }
}
