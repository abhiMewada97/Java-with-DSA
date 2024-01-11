public class array_sorted_or_not {
    
    public static boolean sortedOrNot(int []arr, int i){
        
        // boolean flag;
        if(arr.length-1 == i){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return sortedOrNot(arr,i+1);
    }

    public static void main(String []args){

        int arr[] = {1,3,6,7,8};
        System.out.println(sortedOrNot(arr,0));
    }
}
