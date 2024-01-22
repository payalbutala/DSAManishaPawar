/*
* Q3. Spiral matrix 2
Problem Description
Given an integer matrix A of size NxN. Print the matrix in spiral form starting from A[0][0] in the first row.
For example : Given matrix of 2x2
1 2
3 4
You should print => 1 2 4 3


Problem Constraints
1 <= N <= 1000
1 <= A[i] <= 109


Input Format
First line is N
Next N line contains N integers in each line


Output Format
Print matrix in spiral form in a single line


Example Input
Input 1:
2
5 2
6 8
Input 2:
3
8 2 5
2 9 6
5 8 7


Example Output
Output 1:
5 2 8 6
Output 2:
8 2 5 6 7 8 5 2 9

* */


import java.util.Scanner;

public class printSpiralMatrix {

    public static void printSprialMatrix(int[][] A, int len){

        int i=0;
        int j=0;

        while(len>1){
            for(int k=1; k<len; k++){
                System.out.print(A[i][j] + " ");
                j++;
            }

            for(int k=1; k<len; k++){
                System.out.print(A[i][j] + " ");
                i++;
            }

            for(int k=1; k<len; k++){
                System.out.print(A[i][j] + " ");
                j--;
            }

            for(int k=1; k<len; k++){
                System.out.print(A[i][j] + " ");
                i--;
            }

            i++;
            j++;
            len=len-2;
            if(len==1) {
                // len = len-1;
                System.out.print(A[i][j] + " ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[][] A = new int[len][len];

        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                A[i][j] = sc.nextInt();
            }
        }

        printSprialMatrix(A, len);
    }
}
