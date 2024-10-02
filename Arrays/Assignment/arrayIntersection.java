import java.util.Scanner;

public class arrayIntersection {
    public static void intersections(int arr1[], int arr2[])
    {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j])
                {
                    System.out.print("Common Elements: " +arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int size1 = sc.nextInt();
            int arr1[] = new int[size1];
            for (int j = 0; j < size1; j++) {
                 arr1[j] = sc.nextInt();
            }
            int size2 = sc.nextInt();
            int arr2[] = new int[size2];
            for (int j = 0; j < size2; j++) {
                arr2[j] =sc.nextInt();
            }
           intersections(arr1, arr2); 
        }
    }
}
