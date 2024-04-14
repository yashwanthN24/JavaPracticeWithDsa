package BackTracking;

public class FindingPermutationsOfString {
    public static void findpermutations(String str, String ans) {
        // base case 
        if (str.length() == 0) {
            System.out.println(ans);
            return; 
        }



        // recursion 
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            // abcde = "ab"  + "de"  // to remove c 
            String newStr = str.substring(0, i) + str.substring(i+1);
            findpermutations(newStr, ans + currchar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findpermutations(str, "");


        // time complexity : O(n*n!)
        //we take n calls to get one permutation
        // for n! permutation we take n * n! calls which is the total time 
        
        // space complexity O(n) 
        // as for each permutation we have n calls 
        // we didnt create any additional variables or arrays apart from input so space depends only on recursive call 
        // i.e O(n)
        
    }
}
