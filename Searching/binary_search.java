
class binary_search{

    public static int searching(int arr[], int key){
        
        int last = arr.length-1;
        int start =0;
        int mid = last/2;

        while(start <= last ){
            
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                last = mid-1;
                mid = (last+start)/2;
            }
            else {
                start = mid+1;
                mid = (last+start)/2;
            }
        }
        return -1;
    }

    public static void main(String []args){

        int arr[] = {2,4,8,9,12,16,17,37,57,89,91};

        System.out.println(searching(arr, 91));
    }
}