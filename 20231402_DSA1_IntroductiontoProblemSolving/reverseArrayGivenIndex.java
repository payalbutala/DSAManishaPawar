import java.util.Scanner;

public class reverseArrayGivenIndex {

    public static int[] reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Length : ");
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];

        System.out.println("Enter Numbers : ");
        for(int i=0; i<arrLen; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Start & End Index to Reverse Array : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        reverseArray(arr, start, end);

        for(int i=0; i<arrLen; i++ ){
            System.out.println(arr[i]);
        }
    }
}
