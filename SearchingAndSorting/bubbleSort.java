import java.util.Scanner;

public class bubbleSort {
public static void bubblesort(int arr[])
{
    for (int i = 0; i < arr.length -1; i++) {
        for (int j = 0; j < arr.length - i -1; j++) {
            if(arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            System.out.println("Enter size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter Array Elements: ");
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt(); 
            }
            bubblesort(arr);
            System.out.println("Sorted Array: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
