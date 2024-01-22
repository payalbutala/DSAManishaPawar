/*
* Q6. Even numbers in a range
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.

Each query consists of two integers B[i][0] and B[i][1].

For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].



Problem Constraints
1 <= N <= 105
1 <= Q <= 105
1 <= A[i] <= 109
0 <= B[i][0] <= B[i][1] < N


Input Format
First argument A is an array of integers.
Second argument B is a 2D array of integers.


Output Format
Return an array of integers.


Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [   [0, 2]
        [2, 4]
        [1, 4]   ]
Input 2:
A = [2, 1, 8, 3, 9, 6]
B = [   [0, 3]
        [3, 5]
        [1, 3]
        [2, 4]   ]


Example Output
Output 1:
[1, 1, 2]
Output 2:
[2, 1, 1, 1]


Example Explanation
For Input 1:
The subarray for the first query is [1, 2, 3] (index 0 to 2) which contains 1 even number.
The subarray for the second query is [3, 4, 5] (index 2 to 4) which contains 1 even number.
The subarray for the third query is [2, 3, 4, 5] (index 1 to 4) which contains 2 even numbers.
For Input 2:
The subarray for the first query is [2, 1, 8, 3] (index 0 to 3) which contains 2 even numbers.
The subarray for the second query is [3, 9, 6] (index 3 to 5) which contains 1 even number.
The subarray for the third query is [1, 8, 3] (index 1 to 3) which contains 1 even number.
The subarray for the fourth query is [8, 3, 9] (index 2 to 4) which contains 1 even number.


* */

import java.util.ArrayList;
import java.util.Scanner;

public class evenNumberCount {
    public static int[] evenNumberInRange(int[] A, int[][] B){
        int len = A.length;
        int[] ans = new int[B.length];
        int[] pf = new int[len];

        int count = 0;
        for(int i=0; i<len; i++){
            if(A[i] % 2 == 0){
                count++;
            }
            pf[i] = count;
        }

        for(int j=0; j<B.length; j++){
            int e = B[j][1];
            int s = B[j][0];
            s = s == 0 ? 0 : pf[s-1];
            ans[j] = pf[e] - s;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for(int k=0; k<len; k++){
            arr[k] = sc.nextInt();
        }


        System.out.println("Enter Queries Length : ");
        int lenQ = sc.nextInt();
        int[][] queries = new int[lenQ][1];

        for(int i=0; i<len; i++){
            queries[i][1] = sc.nextInt(); // Need to accept input as a form in 2DArrayList. Only this part is pending rest code is working well in scaler.
        }

        System.out.println(evenNumberInRange(arr, queries));

//        for(int j=0; j<queries; j++){
//            queryArr.add(j, sc.nextInteger()); Need to accept input as a form in 2DArrayList. Only this part is pending rest code is working well in scaler.
//        }
    }
}

// TC : O(N)
// SC : O(N)
