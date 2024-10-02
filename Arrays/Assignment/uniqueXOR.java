
import java.util.Scanner;

public class uniqueXOR {
    public static int findUnique(int arr[])
    {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = answer ^ arr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int uniqueElement = findUnique(arr);
            System.out.println("Unique Element is: "+ uniqueElement);
        }
    }
}
