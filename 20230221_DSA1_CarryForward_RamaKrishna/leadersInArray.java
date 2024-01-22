/*
* Q2. Leaders in an array

Problem Description
Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 108


Input Format
There is a single input argument which a integer array A


Output Format
Return an integer array denoting all the leader elements of the array.


Example Input
Input 1:
 A = [16, 17, 4, 3, 5, 2]
Input 2:
 A = [5, 4]


Example Output
Output 1:
[17, 2, 5]
Output 2:
[5, 4]


Example Explanation
Explanation 1:
 Element 17 is strictly greater than all the elements on the right side to it.
 Element 2 is strictly greater than all the elements on the right side to it.
 Element 5 is strictly greater than all the elements on the right side to it.
 So we will return these three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.

Explanation 2:
 Element 5 is strictly greater than all the elements on the right side to it.
 Element 4 is strictly greater than all the elements on the right side to it.
 So we will return these two elements i.e [5, 4], we can also any other ordering.
* */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class leadersInArray {
    public static ArrayList<Integer> findLeaderElements(ArrayList<Integer> A) {
        int len = A.size()-1;
        int max = A.get(len);
        ArrayList<Integer> leader = new ArrayList<>();
        leader.add(max);

        for(int i=len-1; i>=0; i--){
            if(A.get(i) > max){
                max = A.get(i);
                leader.add(A.get(i));
            }
        }

        return leader;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements Length : ");
        int len = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0; i<len; i++){
            A.add(sc.nextInt());
        }

        System.out.println(findLeaderElements(A));
    }
}
