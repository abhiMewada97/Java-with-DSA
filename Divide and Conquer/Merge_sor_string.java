public class Merge_sor_string {

    public static void mergeSort(String arr[], int si, int ei){

        mergeSort(arr, si, ei);
        divide(arr,si,ei);
    }
    
    public static void main(String []args){

        String arr = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr,0,arr.lengh-1);
    }
}
