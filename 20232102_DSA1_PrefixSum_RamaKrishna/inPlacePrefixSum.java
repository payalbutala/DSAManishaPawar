/*
* Q3. In-place Prefix Sum
Problem Description
Given an array A of N integers. Construct prefix sum of the array in the given array itself.

Problem Constraints
1 <= N <= 105
1 <= A[i] <= 103

Input Format
Only argument A is an array of integers.

Output Format
Return an array of integers denoting the prefix sum of the given array.

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
Input 2:

A = [4, 3, 2]
Example Output

Output 1:
[1, 3, 6, 10, 15]
Output 2:
[4, 7, 9]

Example Explanation
Explanation 1:
The prefix sum array of [1, 2, 3, 4, 5] is [1, 3, 6, 10, 15].
Explanation 2:
The prefix sum array of [4, 3, 2] is [4, 7, 9].
* */

import java.util.Scanner;

public class inPlacePrefixSum {
    public static int[] inPlace(int[] A){
        int len = A.length;

        for(int i=1; i<len; i++){
            A[i] = A[i-1] + A[i];
        }

        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for(int j=0; j<len; j++){
            arr[j] = sc.nextInt();
        }

        arr  = inPlace(arr);
        for(int k=0; k<len; k++){
            System.out.print(arr[k] + " ");
        }
    }
}

//TC : O(N)
//SC : O(1)