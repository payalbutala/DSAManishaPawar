import java.util.Scanner;

public class printAllSubArrays {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        int[] arr = new int[len];


        System.out.println("Enter Array Elements : ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

// TC : O(N^3)
// SC : O(1)