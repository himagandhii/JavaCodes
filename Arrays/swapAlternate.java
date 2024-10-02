import java.util.Scanner;

public class swapAlternate {
    public static void swap(int arr[], int n)
    {
        for(int i = 0; i < n-1; i+=2)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j = 0; j < n; j++)
            {
                arr[j] = sc.nextInt();
            }
            swap(arr, n);
            // Print the array for the current test case
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
        System.out.println();  // Move to next line for the next test case
        }
    }
}
