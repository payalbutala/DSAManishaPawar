
import java.util.Scanner;

public class countFactorAndIsPrime {

    public static int countFactor(int num){
        int count = 0;

        for(int i=1; i<=(int)Math.sqrt(num); i++){
            if(num%i==0){
                if(i==num/i) {
                    // if num is perfect square like 4, i & num/i are same
                    count++;
                } else {
                    count += 2; // both i & num/i are factors of num
                }
            }
        }

        return count;
    }

    public static boolean isPrimeNumber(int num){
        int count = countFactor(num);
        if(count==2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to find total factors of it : ");
        int num = sc.nextInt();
        System.out.print(countFactor(num));


        System.out.println("Enter Number to check it is Prime or Non-prime : ");
        int primeNum = sc.nextInt();
        System.out.println(isPrimeNumber(primeNum));




    }

}