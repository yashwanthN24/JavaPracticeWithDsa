package BackTracking;

public class FindingSubSetsOfString {
    
    public static void findsubsetsofString(String str, StringBuilder ans, int index) {
        // using StringBuilder to avoid the creation of new string at each step

        // // base case
        if (index == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Empty Phi");
            } else {
                System.out.println(ans);
            }

            return;
        }

        // recursion part or work to be done ;

        // yes case where current character is included in the subset
        findsubsetsofString(str, ans.append(str.charAt(index)), index + 1);

        // deleting the last character from the stringbuilder to backtrack to find the other subsets
        ans.deleteCharAt(ans.length() - 1);

        // no case where current character is not included in the subset
        findsubsetsofString(str, ans, index + 1);
    }
    
    public static void findsubsetsofStringUsingString(String str, String ans, int index) {

        // base case
        if (index == str.length()) {
            if (ans == "") {
                System.out.println("Empty Phi");
            } else {
                System.out.println(ans);
            }

            return;
        }

        // recursion part or work to be done ;


        // yes case where current character is included in the subset
        findsubsetsofStringUsingString(str, ans + str.charAt(index), index + 1);
        // no case where current character is not included in the subset
        findsubsetsofStringUsingString(str, ans, index + 1);
    
    }
    public static void main(String[] args) {
        String str = "abc";
        // findsubsetsofString(str, new StringBuilder(""), 0);
        System.out.println();
        findsubsetsofStringUsingString(str, "", 0);
    }
}
