package Divide_And_Conquer;

public class MergesortForStrings {
    public static void merge(String arr[], int si, int mid, int ei) {

        int i = si;
        int j = mid + 1;
        int k = 0;
        String temp[] = new String[ei - si + 1];

        while (i <= mid && j <= ei) {
            if (isSmalleralphabet(arr[i], arr[j])) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void mergesort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);

    }

    public static void printStringArray(String arr[]) {
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static boolean isSmalleralphabet(String str1, String str2) {
        if (str1.compareTo(str2) < 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String strings[] = { "yash", "arvind", "balu", "sanath" };
        printStringArray(strings);
        mergesort(strings, 0, strings.length - 1);
        System.out.println();
        printStringArray(strings);
    }
}
