/*
* Q1. Special Subsequences "AG" - 2
*
Problem Description
You have given a string A having Uppercase English letters.
You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.

Problem Constraints
1 <= length(A) <= 105

Input Format
First and only argument is a string A.

Output Format
Return an long integer denoting the answer.


Example Input
Input 1:
A = "ABCGAG"

Input 2:
A = "GAB"

Example Output
Output 1:
3
Output 2:
0


Example Explanation
Explanation 1:
Subsequence "AG" is 3 times in given string, the pairs are (0, 3), (0, 5) and (4, 5).
Explanation 2:
There is no subsequence "AG" in the given string.

* */

// IDEA : For every "g", count number of "a" on left side.

import java.util.Scanner;

public class countPairsOfLetters_ag {
    public static Long countPairAG(String A) {
        long ans = 0;
        long count = 0;
        int len = A.length();

        for(int i=0; i<len; i++){
            String str = (A.charAt(i)) + "";
            if(str.equals("A")){
                count++;
            }
            else if(str.equals("G")){
                ans = ans + count;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string : ");
        String str = sc.nextLine();

        System.out.println(countPairAG(str));

    }
}
