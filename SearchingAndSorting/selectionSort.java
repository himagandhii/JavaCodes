import java.util.Scanner;

public class selectionSort {
    public static void selectionsort(int arr[])
    {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;

             // Find the minimum element in the unsorted part of the array
            for (int j = i +1 ; j < arr.length; j++) {
                if(arr[j] < min){
                 min = arr[j];
                 minIndex= j;   
                }
            }

             // Swap if a new minimum element is found
            if(minIndex != i)
            {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       
        selectionsort(arr);

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
}
}

