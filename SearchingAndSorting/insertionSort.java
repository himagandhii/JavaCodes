import java.util.Scanner;

public class insertionSort {
    public static void insertionsort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];  // temp is storing value of starting element 
            for (int j = i-1; j>=0  && arr[j] > temp ; j--) {
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
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
            insertionsort(arr);
            System.out.println("Sorted Array is :");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
