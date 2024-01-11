import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {
    
    public static void print(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArr(Integer array[]){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){

        int arr[] = {6,3,2,0,1,4};
        print(arr);

        Arrays.sort(arr,0,3);         //zero se 2nd index tak sort ker do
        print(arr);
        
        Arrays.sort(arr);
        print(arr);
        
        System.out.println();
        Integer array[] = {6,9,2,7,1,4};    //this array is object of integer class
        printArr(array);
        
        Arrays.sort(array,0,3,Collections.reverseOrder());
        printArr(array); 

        Arrays.sort(array,Collections.reverseOrder());
        printArr(array);
    }
    
}

