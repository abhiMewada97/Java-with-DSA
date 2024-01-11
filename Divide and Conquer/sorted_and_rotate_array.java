public class sorted_and_rotate_array {

    public static int search(int []arr, int tar, int si, int ei){

        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(arr[mid] == tar){
            return mid;
        }

        // mid on line 1
        if( arr[si] <= arr[mid]){

            // case a : left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            // case b : left
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        // mid on line 2
        else{
            // case c : right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            // case d : left
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    
    public static void main(String []args){

        int []arr = {7,8,9,13,34,45,57,78,89,90,0,1,2,3,4,5,6};
        int tar = 0;

        int target = search(arr,tar,0,arr.length-1);
        System.out.println(target);
    }
}
