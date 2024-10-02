

import java.util.Scanner;

public class unique {
    public static int findUnique(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (i != j)
                {
                    if (arr[i] == arr[j])
                    {
                        break;
                    }
                }
            }
            if(j == arr.length) {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int unique = findUnique(arr);
            System.out.println("Unique Element is: " + unique);
        }
    }
}
