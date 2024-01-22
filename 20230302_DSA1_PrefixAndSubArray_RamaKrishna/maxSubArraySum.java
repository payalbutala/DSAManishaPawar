/*
* Q5. Max Sum Contiguous SubArray = Kadane's algorithm
Unsolved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
Find the maximum sum of contiguous non-empty subarray within an array A of length N.



Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000



Input Format
The first and the only argument contains an integer array, A.



Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input
Input 1:
 A = [1, 2, 3, 4, -10]
Input 2:
 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
sum   -2  1  -2  2  1  3  4   -1  3
max   -2  1   1  2  2  3  4   4   4

Example Output
Output 1:

 10
Output 2:

 6


Example Explanation
Explanation 1:

 The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
Explanation 2:

 The subarray [4,-1,2,1] has the maximum possible sum of 6.


*
* */

import java.util.Scanner;

public class maxSubArraySum {
    public static long maxSumSubArray(int[] A){
        long sum = A[0];
        long maxSum = A[0];

        for(int j=1; j<A.length; j++){
            if(sum < 0){
                sum = 0;
            }
            sum = sum + A[j];
            System.out.println(sum);
            maxSum = Math.max(sum, maxSum);

        }

        return maxSum;
    }
    /* DRY RUN
    1 2 3 4 -10
sum 1 3 6 10  0
max 1 3 6 10  10

    A = [-2,  1,  -3,  4, -1, 2, 1, -5, 4]
sum      -2 -1/0 -3/0  4  3   5  6   1  5
max      -2  -1   -1   4  4   5  6   6  6

    A = [-163, -20]
sum     -163 -183
max     -163 -163
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for(int k=0; k<len; k++){
            arr[k] = sc.nextInt();
        }

        System.out.println(maxSumSubArray(arr));
    }
}
