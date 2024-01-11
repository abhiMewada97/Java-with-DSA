public class bubble_sort {

    public static void bubbleSort(int arr[]){

        int swap =0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<(arr.length-1)-i; j++){
                if (arr[j]>arr[j+1]) {
                    swap++;
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swap == 0){
                break;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n"+swap+" ");
    }

    public static void main(String []args){

        // int []arr = {4,5,6,7,8};
        int []arr = {4,8,6,74,5};
        bubbleSort(arr);
    }
    
}
