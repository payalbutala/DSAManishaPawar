import java.util.Scanner;

public class IMP_rotateArrayAmazonGoogle {

    public static int[] reverseArray(int[] arr, int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        return arr;
    }

    public static int[] rotateArray(int[] arr, int k){
//        int s = 0;
//        int e = arr.length-1;

//        while(s<e){
//            int temp = arr[s];
//            arr[s] = arr[e];
//            arr[e] = temp;
//            s++;
//            e--;
//        }
        reverseArray(arr, 0, arr.length-1);




//        s=0;
//        e=k-1;
//        while (s<e){
//            int temp = arr[s];
//            arr[s] = arr[e];
//            arr[e] = temp;
//            s++;
//            e--;
//        }

        reverseArray(arr, 0, k-1);

//        s=k;
//        e= arr.length-1;
//        while (s<e){
//            int temp = arr[s];
//            arr[s] = arr[e];
//            arr[e] = temp;
//            s++;
//            e--;
//        }
        reverseArray(arr, k, arr.length-1);

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter K value, rotate Element count : ");
        int k = sc.nextInt();

        if(k>arr.length-1){ // not require, even if you add that is fine
            k=k%arr.length;
        }

        rotateArray(arr, k);

        for(int i=0; i<len; i++){
            System.out.println(arr[i]);
        }
    }
}
