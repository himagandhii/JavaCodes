import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static int[] merge(int arr1[], int arr2[])
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int ans[] = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                ans[k] = arr1[i];
                k++;
                i++;
            }
            else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
         // Copy remaining elements of arr1
        while(i < arr1.length)
        {
            ans[k] = arr1[i];
            k++;
            i++;
        }
        // Copy remaining elements of arr2
        while(j < arr2.length)
        {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr1[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = sc.nextInt();
            }
            int m = sc.nextInt();
            int arr2[] = new int[m];
            for (int k = 0; k < m; k++) {
                arr2[k] = sc.nextInt();
            }
            int ans[]= merge(arr1, arr2);
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[j] + " ");
            }
            System.out.println();
        }
    }
}
