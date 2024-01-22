import java.util.Scanner;

public class contest1_Q3{
//    public int[] solve(String A, int[][] B) {

    public static void main(String[] args) {
        int[] ans  = countVowels();
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }



    public static int[] countVowels() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int len1 = sc.nextInt();
        int[][] B = new int[len1][2];

        for(int i=0; i<len1; i++){
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        int len = A.length();
        int[] pf = new int[len];
        int count = 0;
        int[] ans = new int[len1];

        for(int k=0; k<len; k++){
            String str = A.charAt(k)+"";
            if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")){
                count++;
            }
            pf[k]=count;
        }

        for(int j=0; j<len1; j++){
            int s = B[j][0];
            int e = B[j][1];

            if(s==0) {
                ans[j] = pf[e];
            } else {
                ans[j] = pf[e] - pf[s-1];
            }

        }

        return ans;
    }
}
