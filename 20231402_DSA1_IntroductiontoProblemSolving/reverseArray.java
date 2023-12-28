import java.util.Scanner;

public class reverseArray {

    public static int[] reverseArrayNumbers(int[] arr){
        int startIndex = 0;
        int endIndex = arr.length-1;

        while(startIndex < endIndex){
            // swap numbers
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            // increment/decrement index
            startIndex++;
            endIndex--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        System.out.println("Enter Array Elements : ");
        for(int i=0; i<arrLength; i++){
            arr[i] = sc.nextInt();
        }

        reverseArrayNumbers(arr);

        // Printing output array
        for(int i=0; i<arrLength; i++){
            System.out.println(arr[i]);
        }
    }
}
