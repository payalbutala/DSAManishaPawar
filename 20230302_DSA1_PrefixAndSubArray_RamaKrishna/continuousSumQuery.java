/*
* Continuous Sum Query
Problem Description
There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B


Problem Constraints
1 <= A <= 2 * 105
1 <= L <= R <= A
1 <= P <= 103
0 <= len(B) <= 105


Input Format
The first argument is a single integer A.
The second argument is a 2D integer array B.


Output Format
Return an array(0 based indexing) that stores the total number of coins in each beggars pot.


Example Input
Input 1:-
A = 5
B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]


Example Output
Output 1:-
10 55 45 25 25


Example Explanation
Explanation 1:-
First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]
Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]
Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]


*
* */

import java.util.Scanner;

public class continuousSumQuery {
    public static int[] continuousSum(int A, int[][] B){
        int[] ans  = new int[A];
        for(int i=0; i<B.length; i++){ // Q queries
            int s = B[i][0]-1;
            int e = B[i][1];
            int val = B[i][2];

            ans[s] = ans[s] + val;
            if (e < A) {
                ans[e] = ans[e] - val;
            }
        }

        for(int j=1; j<A; j++){ // N as A length
            ans[j] = ans[j] + ans[j-1];
        }

        return ans;
    }

    // TC : O(Q+N)
    // SC : O(1)

    /*
A=10
                0   1   2   3    4   5   6   7   8   9
s   e   v       10          -10      2               -2
0   3   10
5   9   2
2   5   3
1   8   4
5   7   5


A = 0   0    0   0   0
    10  10
        20  20
        25  25  25  25
    10  55  45  25  25



*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        int[] ans = new int[len];

        System.out.println("Enter Array Queries Length : ");
        int queries = sc.nextInt();
        int[][] queryArr = new int[queries][3];

        for(int k=0; k<queries; k++){
            queryArr[k][0] = sc.nextInt();
            queryArr[k][1] = sc.nextInt();
            queryArr[k][2] = sc.nextInt();
        }

        ans = continuousSum(len, queryArr);

        for(int k=0; k<len; k++){
            System.out.println(ans[k]);
        }
    }
}
