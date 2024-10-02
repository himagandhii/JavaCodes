import java.util.Scanner;

public class linearSearch {
    public static int search(int arr[], int x)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int t = sc.nextInt();
         for (int i = 0; i < t; i++ )
         {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int j= 0 ; j <n; j++)
            {
                arr[j] = sc.nextInt();
            }
            int x = sc.nextInt();
            System.out.println(search(arr, x));
         }
    }
}
