import java.util.*;

public class sub_array_sum_kadan_algo {
    
    public static int maxSum(int arr[]) {
        int maxSum=arr[0], sum=0;

        for(int i=0; i<arr.length; i++) {
            
            sum+=arr[i];
            if(sum<0) {
                sum=0;
            }
            maxSum=Math.max(maxSum,sum);
        }

        return maxSum;
    }

    public static void main(String []args) {

        // int []arr = new int[5];
        // Scanner sc = new Scanner(System.in);
        
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        
        int []arr = {2, 4, -8, 8, 10};
        
        int maxSum = maxSum(arr);
        System.out.println(maxSum);
    }
}
