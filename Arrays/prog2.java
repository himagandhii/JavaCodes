import java.util.Scanner;
public class prog2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of array");
     int size = sc.nextInt();
     int input[] = new int[size];
     System.out.println("Enter array elements:");
     for(int i = 0; i < size; i++)
     {
        input[i] = sc.nextInt();
     }
     System.out.println("Array elements:");
     for(int i = 0; i < size; i++)
     {
            System.out.print(input[i]+ " ");
     }
     System.out.println();
    }
}
