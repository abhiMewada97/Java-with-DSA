public class Majority_elemnent {
    
    public static void main(String []args){

        int arr[] = {2,5,5,5,2,2,4,5};
        int count;
        int h=1;
        int n=0;

        for(int i=0; i<arr.length; i++){
            count=0;

            for(int j=i; j<arr.length; j++){

                if(arr[i]==arr[j])
                count++;
            }

            if(count > h){
                h=count;
                n = arr[i];
            }
        }
        System.out.print(n);
    }
}
