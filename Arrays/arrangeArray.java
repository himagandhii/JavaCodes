import java.util.Scanner;

public class arrangeArray {
    public static void arrange(int arr[], int n)
    {
        int i = 0; int j = n-1; int number =1;
        while(i <= j)
        {
            if(number %2 == 1){ // Odd numbers go from the start
            arr[i] = number;
            number++;
            i++;
            }
            else{  // Even numbers go from the end
            arr[j] = number;
            number++;
            j--;
            }
        }
    } 
{

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 0; i < t; i++)
    {
        int n  = sc.nextInt();

         // Handle case when n is 0 (empty array)
         if (n == 0) {
            System.out.println("Array size is 0");
            continue;
        }

        int arr[] = new int[n];
        arrange(arr, n); // Arrange the array

        // Print the array for the current test case
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();  // Move to next line for the next test case
    }
} 
}
