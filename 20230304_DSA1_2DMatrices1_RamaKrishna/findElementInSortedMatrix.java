/*
* Q4. Find in matrix
Unsolved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
Given an matrix A of size NxN, which is row-wise and column-wise sorted. Find if the number B exists in the matrix.

Note :
0 represents False and 1 represents True


Problem Constraints
1 <= N <= 103
-105 <= A[i][j] <= 105


Input Format
First argument A is an matrix of integers.
Second argument is B.


Output Format
Return a boolean value stating if the number exists or not


Example Input
Input 1:

A = [[1, 5, 6],
[4, 8, 11],
[7, 9, 14]]
B = 14
Input 2:

A = [[4, 10],
[4, 12]]
B = 5


Example Output
Output 1:

True
Output 2:

False


Example Explanation
Explanation 1:

14 is found at the last index in the matrix.
Explanation 2:

5 is not present in the matrix.


*
* */

import java.util.Scanner;

public class findElementInSortedMatrix {

    public static int findInMatrix(int[][] A, int B){
        int len = A.length;
        int i=0, j=len-1;

        while(j>=0 && i<len){
            if(A[i][j] == B){
                return 1;
            } else if(A[i][j] > B){
                j--;
            } else {
                i++;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix N*N length : ");
        int N = sc.nextInt();
        System.out.println("Enter Number to find in Matrix : ");
        int B = sc.nextInt();
        int[][] A = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println(findInMatrix(A, B));
    }
}
// TC : O(N+M)
// SC : O(1)