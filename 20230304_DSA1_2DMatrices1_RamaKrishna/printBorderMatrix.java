import java.util.Scanner;

public class printBorderMatrix {

    public static void printBorderNNMatrix(int[][] A, int N) {
        int i=0;
        int j=0;
        for (j = 0; j < N-1; j++) {
            System.out.println(A[i][j]);
        }
        //i=0, j=2
        for (i = 0; i < N-1; i++) {
            System.out.println(A[i][j]);
        }
        // i=2, j=2
        for (j = N-1; j > 0; j--) {
            System.out.println(A[i][j]);
        }
        //i=2, j=0
        for (i = N-1; i > 0; i--) {
            System.out.println(A[i][j]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        int[][] A = new int[len][len];
        int num = 1;


        for(int j=0; j<len; j++){
            for(int k=0; k<len; k++){
                A[j][k] = num;
                num++;
//                System.out.println(num);
            }
        }

        if(len==1){
            System.out.println(A[0][0]);
        }
        else {
            printBorderNNMatrix(A, len);
        }
    }
}


/*
 * Idea
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * o/p => 1 2 3 6 9 8 7 4
 *
 * i = 0 j = 0
 * i = 0 j = 1
 * i = 0 j = 2
 * i = 1 j = 2
 * i = 2 j = 2
 * i = 2 j = 1
 * i = 2 j = 0
 * i = 1 j = 0
 * i=0; j=0;
 * for(j=0; j<N; j++){
 *   printA[i][j]
 * }
 * i=0, j=2
 * for(i=0; i<N; i++){
 *   A[i][j]
 * }
 * i=2, j=2
 * for(j=N; j>=0; j--){
 *   A[i][j]
 * }
 * i=2, j=0
 * for(i=N; i>0; i--){
 * A[i][j]
 * }
 *
 * */
