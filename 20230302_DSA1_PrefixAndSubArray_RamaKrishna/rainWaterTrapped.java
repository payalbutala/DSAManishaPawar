/*
* Q4. Rain Water Trapped
Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.



Problem Constraints
1 <= |A| <= 100000



Input Format
First and only argument is the vector A



Output Format
Return one integer, the answer to the question



Example Input
Input 1:

A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

1 unit is trapped on top of the 3rd element.
Explanation 2:

No water is trapped.

* */

import java.util.Scanner;

public class rainWaterTrapped {
    public static int waterTrapped(int[] A, int len){
        int[] prefixSum = new int[len];
        int[] suffixSum = new int[len];
        int[] level = new int[len];
        int waterAcc = 0;
        prefixSum[0] = A[0];
        suffixSum[len-1] = A[len-1];

        for(int i=1; i<len; i++){
            prefixSum[i] = Math.max(prefixSum[i-1], A[i]);
        }

        for(int j=len-2; j>=0; j--){
            suffixSum[j] = Math.max(suffixSum[j+1], A[j]);
        }

        for(int k=0; k<len; k++){
            level[k] = Math.min(prefixSum[k], suffixSum[k]);
            waterAcc = waterAcc + Math.abs(level[k] - A[k]);
        }

        return waterAcc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for(int k=0; k<len; k++){
            arr[k] = sc.nextInt();
        }

        System.out.println(waterTrapped(arr, len));
    }
}

//TC : O(N+N+N)
//SC : O(N+N)