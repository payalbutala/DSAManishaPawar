/*
* Q5. Sum of All Subarrays
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.



Problem Constraints
1 <= N <= 105
1 <= Ai <= 10 4


Input Format
The first argument is the integer array A.


Output Format
Return a single integer denoting the sum of all subarray sums of the given array.


Example Input
Input 1:
A = [1, 2, 3]
Input 2:

A = [2, 1, 3]


Example Output
Output 1:
20
Output 2:

19


Example Explanation
Explanation 1:
The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
Explanation 2:

The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19


*
* */

import java.util.Scanner;


public class sumOfAllSubarrays_Google_technique {

    public static long subarraySum(int[] A) {
        int len = A.length;
        long sum = 0; // long because TC : O(N^2) => Total subarray => (10^5)^2 = 10^10
        //       = (10^5)*10^4 = 10^9 => single subarray =>         = 10^9
        // both multiple 10^19 TLE

        for(int i=0; i<A.length; i++){
            sum = sum + 1L * A[i]*(1L*(i+1)*(len-i));
        }

        return sum;
    }

    // A = [10^4, 10^4, ...... ] 10^5 values => 10^4 * 10^5 = 10^9 -> putting this in TC O(N2) => 10^10

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        int[] arr = new int[len];


        System.out.println("Enter Array Elements : ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(subarraySum(arr));
    }
}
