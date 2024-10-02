import java.util.Scanner;

public class tripletSum {
    public static int sumTriplet(int arr[],int findSum)
    {
        int numPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == findSum)
                {
                    numPairs +=1;
                } 
                } 
            }
        }
        return numPairs;
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
            int findSum = sc.nextInt();
            System.out.println("Total Pairs: " + sumTriplet(arr, findSum));
        }   
        
    }
}
