import java.util.Scanner;

public class arraySum {
    public static int sum(int[] arr){
        int ans = 0;
        for(int i = 0; i < arr.length; i++)
        {
            ans += arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         for(int i = 0; i < t; i++)
         {
            int n  = sc.nextInt();
            int[] arr = new int[n];


            for(int j = 0; j < n; j++)
            {
                arr[j] = sc.nextInt();
            }
            System.out.println(sum(arr));
         }
         
    }
}
