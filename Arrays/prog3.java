import java.util.Scanner;

public class prog3 {
    
    public  static int[] takeInput(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of array");
     int size = sc.nextInt();
     int input[] = new int[size];
     System.out.println("Enter array elements:");
     for(int i = 0; i < size; i++)
     {
        input[i] = sc.nextInt();
     }
     return input;
    }
     public static void print(int input[])
     {
        int size = input.length;
        System.out.println("Array Elements are:");
        for(int i = 0; i < size; i++)
        {
            System.out.println(input[i]+ " ");
        }
     }
     public static void main(String[] args) {
        int arr[] = takeInput();
        print(arr);

    }
}
