import java.util.Scanner;

public class ZeroCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int L = scanner.nextInt();
        int K = scanner.nextInt();
        
        // Calculate the number of zeros
        int Z = L - K;
        
        // Determine the longest contiguous block of zeros
        int longestZeros = 0;
        
        if (K == 0) {
            // All zeros
            longestZeros = L;
        } else if (K >= L) {
            // No zeros
            longestZeros = 0;
        } else {
            // Distributing zeros in K + 1 gaps
            longestZeros = (Z + (K + 1) - 1) / (K + 1); // Using ceiling logic
        }
        
       
        System.out.println(longestZeros);
        
        scanner.close();
    }
}
