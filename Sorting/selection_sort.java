public class selection_sort{
    public static void selectionSort(int arr[]){

        int size = arr.length;
        for(int i=0; i<size-1; i++){
            int minIndex = i;
            for(int j=i; j<size; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
           
            int temp=arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
  
        }
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String []args){

        // int arr[] = {6,3,2,7,1,4};
        int arr[] = {1,2,3,4,5,6,7};
        selectionSort(arr);
    }
}