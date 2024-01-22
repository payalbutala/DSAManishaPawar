/*
* Maximum subarray sum of fixed length
Problem Description
Given an array A of length N, Find the maximum subarray sum out of all possible subarray of length B.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 106


Input Format
First argument A is an array of integers.
Second argument B is length of subarray.


Output Format
Return a single integer i.e. max subarray sum


Example Input
Input 1:

A = [6, 7, 8, 2]
B = 2
Input 2:

A = [3, 9, 5, 6, 5, 11]
B = 3


Example Output
Output 1:

15
Output 2:

22


Example Explanation
Explanation 1:

Subarray with maximum sum is [7, 8] with sum 15.
Explanation 2:

Subarray with maximum sum is [6, 5, 11] with sum 22.

* */
//
//import java.util.Scanner;
//
//public class maxSubArraySumFixLength {
//
//    public static long maxSum(long[] pf, int B){
//        long sum = Integer.MIN_VALUE;
//        int len = pf.length;
//        int s=0; int e=B-1;
//
//        while(e<len){
//            if(s==0){
//                sum = Math.max(sum, pf[e]);
//            } else {
//                sum = Math.max(sum, pf[e] - pf[s-1]);
//            }
//            s++;
//            e++;
//        }
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Array Length : ");
//        int len = sc.nextInt();
//        int[] A = new int[len];
//
//        for(int i=0; i<len;i++){
//            A[i] = sc.nextInt();
//        }
//        System.out.println("Enter SubArray Length : ");
//        int B = sc.nextInt();
//
//        long[] pf = new long[len];
//        pf[0] = A[0];
//
//        for(int i=1; i<len; i++){
//            pf[i] = pf[i-1] + A[i];
//        }
//
//        System.out.println(maxSum(pf, B));
//    }
//}

/*
* TC : O(N-K+1)+O(N) ~ O(N)
* SC : O(N)
* */


//-------------------------------------

import java.util.Scanner;

public class maxSubArraySumFixLength {

    public static long maxSum(int[] A, int B){
        long sum = Integer.MIN_VALUE;
        long rangeSum = 0;
        int len = A.length;
        int s=0; int e=B-1;

        for(int i=s; i<B; i++){
            rangeSum = rangeSum + A[i];
        }
        s++;
        e++;

        sum = Math.max(rangeSum, sum);

        while(e<len){
            rangeSum = rangeSum + A[e] - A[s-1];
            sum = Math.max(rangeSum, sum);
            s++;
            e++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        int[] A = new int[len];

        for(int i=0; i<len;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter SubArray Length : ");
        int B = sc.nextInt();

        System.out.println(maxSum(A, B));
    }
}
/*
 * TC : O(N-K)+O(N) = O(N)
 * SC : O(1)
 * */