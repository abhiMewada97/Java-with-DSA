public class insertion_sort {

    public static void insertionSort(int arr[]) {

        int size = arr.length;
        for (int i = 1; i <= size - 1; i++) {
            int curr = arr[i];
            int prev = i-1;
            
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;


        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {6,3,2,7,1,4};
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        insertionSort(arr);
    }

}
