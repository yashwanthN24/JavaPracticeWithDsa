package patterns.advancepatterns;

public class PalindromicPyramidwithNumbers {

    public static void printpattern(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers decreasing
            for(int j = i ; j>=1 ;j--)
                System.out.print(j);

            // numbers increasing 
            if(i!=1)
            for(int j = i-k+1; j<=i ; j++)
                System.out.print(j);
        System.out.println();
            if(i!=1)
            k++;
        }
    }

    public static void main(String[] args) {
        printpattern(5);
    }
}
