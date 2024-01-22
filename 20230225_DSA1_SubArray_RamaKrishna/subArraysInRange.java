/*
* Q7. Subarray in given range
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
Given an array A of length N, return the subarray from B to C.


Problem Constraints
1 <= N <= 105

1 <= A[i] <= 109

0 <= B <= C < N



Input Format
The first argument A is an array of integers

The remaining argument B and C are integers.



Output Format
Return a subarray


Example Input
Input 1:
A = [4, 3, 2, 6]
B = 1
C = 3
Input 2:

A = [4, 2, 2]
B = 0
C = 1


Example Output
Output 1:
[3, 2, 6]
Output 2:

[4, 2]


Example Explanation
Explanation 1:
The subarray of A from 1 to 3 is [3, 2, 6].
Explanation 2:
The subarray of A from 0 to 1 is [4, 2].


* */

import java.util.Scanner;

public class subArraysInRange {
    public static int[] subArrayRangeSum(int[] A, int B, int C) {
        int len = C-B+1;
        int[] arr = new int[len];
        int idx = 0;

        for(int i=B; i<=C; i++){
            arr[idx] = A[i];
            idx++;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter Array Elements : ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Array Start Range : ");
        int B = sc.nextInt();
        System.out.println("Enter Array End Range : ");
        int C = sc.nextInt();

        int[] arr1 = subArrayRangeSum(arr, B, C);

        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}

// TC : O(N)
// SC : O(1)


