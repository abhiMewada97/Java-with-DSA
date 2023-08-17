
public class pair_of_array {

    public static void pair(int arr[]){

        int tp=0;
        for(int i=0; i <= arr.length-2; i++){
            for(int j=i+1; j <= arr.length-1; j++){
                System.out.print("("+arr[i]+ ","+ arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are "+tp);
    }

    public static void main(String [] args){

        int arr[] = {2,4,6,8,10};
        pair(arr);
    }
}
