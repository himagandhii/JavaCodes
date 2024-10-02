
import java.util.Scanner;

public class duplicateSum {
  


    public static int findDuplicate(int arr[])
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           
                sum = sum +  arr[i];
        }
        int n = arr.length;
        int SumOfNaturalNumbers = ((n-1) * (n-2))/2;
         
       return sum - SumOfNaturalNumbers;
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
            int solution = findDuplicate(arr);
            System.out.println("Duplicate Element: " + findDuplicate(arr));
            
        }
    }

}
