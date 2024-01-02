/*
* Q2. Generate all subarrays
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.


Problem Constraints
1 <= N <= 100
1 <= A[i] <= 105


Input Format
First argument A is an array of integers.


Output Format
Return a 2D array of integers in any order.


Example Input
Input 1:
A = [1, 2, 3]
Input 2:
A = [5, 2, 1, 4]


Example Output
Output 1:
[[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
Output 2:
[[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]


Example Explanation
For Input 1:
All the subarrays of the array are returned. There are a total of 6 subarrays.
For Input 2:
All the subarrays of the array are returned. There are a total of 10 subarrays.
* */

import java.util.Scanner;

public class generateAllSubArrays {
    public static int[][] generateSubArrays(int[] A) {
        int len = A.length;
        int ansLen = len*(len+1)/2;

        int[][] ans = new int[len][len];

        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                for(int k=i; k<=j; k++){
                    ans[i][j] = A[k];
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter Array Length : ");
//        int len = sc.nextInt();
//        int[] arr = new int[len];
//
//
//        System.out.println("Enter Array Elements : ");
//        for(int i=0; i<len; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        int[][] ans = generateSubArrays(arr);
//        for(int i=0; i<ans.length; i++){
//            for(int j=0; j<ans[0].l; j++){
//                System.out.print(ans[i][j] + " ");
////                for(int k=i; k<=j; k++){
////                }
//            }
//            System.out.println();
//        }


        // take input & execute o/p -> Pgm running in Scaler - here need typo use ArrayList as subArrays are of Different Size
    }
}

// TC : O(N^3)
