//return array from method

public class returnArray {
   public static void main(String[] args)
   {
    int A[] = numbers();
    
      // Print array elements using a loop
      for (int i = 0; i < A.length; i++) {
        System.out.print(A[i] + " ");
     }
   } 
   public static int[] numbers()
   {
    int A[] = new int[3];
    A[0] = 2;
    A[1] = 3;
    A[2] = 4;
    return A;
   }
}
