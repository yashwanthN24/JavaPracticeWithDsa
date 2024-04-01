package Recursion.MorePracticeQuestions;

public class AllOccurencesOfkeyElement {
// For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem
    public static void printKeyoccurences(int arr[], int key, int index) {

        // base case
        if (index == arr.length) {
            return;
        }

        if (arr[index] == key) {
            System.out.print(index + " ");

        }
        printKeyoccurences(arr, key, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        printKeyoccurences(arr, 9, 0);
    }
}
