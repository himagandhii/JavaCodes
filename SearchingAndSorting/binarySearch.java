import java.util.Scanner;

public class binarySearch {
    public static int binarysearch(int arr[], int element)
    {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(element == arr[mid])
            {
                return mid;
            }
            else if(element > arr[mid])
            {
                start = mid +1;
            }
            else{
                end = mid -1;
            }
            
        }
        return -1;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter Array Elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter element to find: ");
            int element = sc.nextInt();
            System.out.println("Element at index: " + binarysearch(arr, element));
             
            
    }
}
