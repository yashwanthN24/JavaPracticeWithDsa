package Arrays.ArrayAlgorithms;

public class countingsort {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void countingSort(int arr[]) {
        // find the largest element in given array to find the range
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // now create a count array that counts the frequency of each element in array
        // arr . so the count array must
        // of size largest + 1 to have a count of all element upto the largest element
        int count[] = new int[largest + 1];

        // now create the counts for each element in arr
        // so traverse the orginal array to update the count or frequency array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // now for sorting we use our frequency(count) array to sort our orginal array
        // so traverse the count array
        // index j for updating the orginal array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            // check counts of each index as our index in count array denotes count of the
            // index element in orginal array
            // while count of any value at index is > 0 place that value into array and
            // decrement its count in countarray
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
        // remember counting sort is efficient in terms of time as its time complexity
        // is
        // O(n + largestelement) if the largest element is small like 7 , 8 10 its falls
        // to
        // O(n) so its efficient as compared to insertionsort , bubble and selection
        // sort
        // but in terms of space its not efficient O(largestelement);
        // countingsort is an example to prove the time-space duality that both time and
        // space cannot be fulfilled at the same time
        // if the algorithm is efficient in time its consumes more space
        // else if the algoritm is space efficient the algorithm consumes lot of time

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingSort(arr);
        printArray(arr);
        // counting sort is mainly used for positive numbers
        // wherein the quantity of numbers is more but thier value is small example u
        // can sort
        // 40 elements easily if they are maximum element is just 7 or 10 or single
        // elements type ;

        // for negative numbers You could separate the negative elements into
        // a different array and applying counting sort on them assuming positive
        // numbers
        // but in descending order and for positive numbers normal ascending order and
        // finally merging these two into a single array
        // gives the sorted array

        // to perform descending order sort just iterate the count array from the end
        // i.e count.length-1 to 0 rest all remain same

    }
}
