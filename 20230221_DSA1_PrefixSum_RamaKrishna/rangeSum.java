/*
* Q4. Range Sum Query
*
Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Problem Constraints
1 <= N, M <= 105
1 <= A[i] <= 109
0 <= L <= R < N

Input Format
The first argument is the integer array A.
The second argument is the 2D integer array B.

Output Format
Return an integer array of length M where ith element is the answer for ith query in B.

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Input 2:
A = [2, 2, 2]
B = [[0, 0], [1, 2]]

Example Output
Output 1:
[10, 5]
Output 2:
[2, 4]


Example Explanation
Explanation 1:
The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
Explanation 2:
The sum of all elements of A[0 ... 0] = 2 = 2.
The sum of all elements of A[1 ... 2] = 2 + 2 = 4.

* */

import java.util.ArrayList;
import java.util.Scanner;

public class rangeSum {
        public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
            return rangeSumOfIndexes(A, B);
        }

        public static ArrayList<Long> rangeSumOfIndexes(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B){
            ArrayList<Long> sum = new ArrayList<>();
            ArrayList<Long> pf = new ArrayList<>();
            pf.add(Long.valueOf(A.get(0)));

            for(int i=1; i<A.size(); i++){
                pf.add(Long.valueOf(pf.get(i-1) + A.get(i)));
            }

            for(int j=0; j<B.size();j++){
                int s = B.get(j).get(0);
                int e = B.get(j).get(1);

                long tot = (s == 0) ? pf.get(e) : pf.get(e) - pf.get(s-1);
                sum.add(tot);
            }

            return sum;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> queryArr = new ArrayList<ArrayList<Integer>>();
        System.out.println("Enter Queries Length : ");
        int queries = sc.nextInt();

        for(int i=0; i<len; i++){
            arr.add(sc.nextInt());
        }

        for(int j=0; j<queries; j++){
//            queryArr.add(j, sc.nextInteger()); Need to accept input as a form in 2DArrayList. Only this part is pending rest code is working well in scaler.
        }
    }
}
// TC : O(N + Q)
// SC : O(N)
