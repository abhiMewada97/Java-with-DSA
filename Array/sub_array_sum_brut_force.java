public class sub_array_sum_brut_force {

    public static void subArraySum(int arr[]){

        int maxSum = Integer.MIN_VALUE,sum;

        for(int i=0; i<=arr.length-1; i++){
            sum = 0;
            for(int j=i; j<=arr.length-1; j++){
                // for(int k=i; k<=j; k++){
                    sum += arr[j];
                // }
                System.out.println(sum);
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum "+ maxSum);
    }

    public static void main(String []args){
        int arr[] = {2,4,6,8,10};
        subArraySum(arr);
    }
    
}
