package Recursion;

public class BinaryStrings {
    // print all binary string (string have only 0 or 1 as its characters ) of size n without consecutive ones
    // examples of valid Strings are "010101"  
    // invalid Strings "011010" , "101011" , "0110"

    public static void printBinaryStrings(int n, int lastplace, String str) {
        // here n denotes the size of our binary if its 3 we have 3 slote to fill each slot can take up 2 choices either 0 or 1 
        // here lastplace provide the infomation of the last slot value either 0 or 1 
        // str is the binary String that we built during recursion 

        // base case if n == 0 i.e no slots to fill 0/1 then print the bullt binary String 
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // if lastplace is 0 we can have either 0 or 1 
        if (lastplace == 0) {
            printBinaryStrings(n - 1, 0, str + "0");
            printBinaryStrings(n - 1, 1, str + "1");
        } else {
            // if lastplace is 1 we can have only 0 (as the condition is no consecutive ones )
            printBinaryStrings(n - 1, 0, str + "0");
        }

    }
    
    public static void printBinaryStr(int n, int lastplace, String str) {
        // base case 
        if(n == 0 )
        {
            System.out.println(str);
            return;
        }
        // compressed version of above code 
        // initially place all 0 then it will go in sequence 000 , 001 , 010 , 100 ...
        printBinaryStr(n - 1, 0, str + "0");
        
        if (lastplace == 0) {
            printBinaryStr(n-1 , 1 , str + "1");
        }
    }
    public static void main(String[] args) {
        printBinaryStr(3, 0, "");
    }
}
