public class Find_key_first_occurence {

    public static int findKey(int []arr, int key, int i){

        if(arr.length-1 < i){
            return -1;
        }

        if(key == arr[i]){
            return i;
        }

        i++;
        return findKey(arr, key, i);
    }
    
    public static void main(String []args){
        int []arr = {26,65,23,62,3,2,62};

        System.out.println(findKey(arr, 88, 0));
    }
}
