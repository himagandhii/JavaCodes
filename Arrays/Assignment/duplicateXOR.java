

import java.util.Scanner;

public class duplicateXOR {
    

    public static int findDuplicate(int arr[])
    {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
           
                answer = answer ^ arr[i];
        }
            for (int i = 0; i <= arr.length-2; i++) {
                answer = answer ^ i;    // XOR with each element of the array
                }
         
       return answer;
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
