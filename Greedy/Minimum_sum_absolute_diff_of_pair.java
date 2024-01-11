import java.util.*;

public class Minimum_sum_absolute_diff_of_pair {
    
    public static void main(String []args){
        
        // int A[] = {1,2,3};
        // int B[] = {2,1,3};
        
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);
        int minSum = 0;

        for(int i=0; i<A.length; i++){
            minSum += Math.abs(A[i]-B[i]);
        }
        System.out.println(" Minimum absolute diff of pair "+minSum);
    }
}
