

import java.util.Scanner;

public class duplicate {
    public static int findDuplicate(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++)  {
                if (i != j)
                {
                    if (arr[i] == arr[j])
                    {
                       return arr[i];
                    }
                }
            }
         
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
           // int solution = findDuplicate(arr);
            System.out.println("Duplicate Element: " + findDuplicate(arr));
            
        }
    }
}
