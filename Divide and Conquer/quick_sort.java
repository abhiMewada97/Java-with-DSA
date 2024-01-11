public class quick_sort{

    public static void printArr(int arr[], int size){
        for(int j=0; j<size; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[],int si, int ei){

        if(si>=ei){
            return;
        }
        int pt = partition(arr,si,ei);
        quickSort(arr,si,pt-1); //left 
        quickSort(arr,pt+1,ei); //rigt
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i=si-1;
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String []args){
        // int arr[] = {2,6,9,8,5,6};
        
        // int arr[] = {1,4,7,9,25,28,37,58};
        int arr[] = {97,76,65,53,43,2};
        printArr(arr,arr.length);

        quickSort(arr,0,arr.length-1);
        printArr(arr,arr.length);
    }
}