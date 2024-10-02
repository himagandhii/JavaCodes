import java.util.Scanner;

public class sort01 {
    public static void sort0and1(int arr[]){
        int nextZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0)
            {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero +=1;
            }
        }
         // Print the sorted array within the function
         System.out.print("Sorted Array: ");
         for (int elem : arr) {
             System.out.print(elem + " ");
         }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] =  new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            sort0and1(arr); 
             // Print the sorted array within the function
        // System.out.print("Sorted Array: ");
        // for (int elem : arr) {
        //     System.out.print(elem + " ");
        // } 
    }
}
}
