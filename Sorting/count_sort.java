
public class count_sort {

    public static void countSort(int arr[]){

        int size = arr.length;
        int largest = Integer.MIN_VALUE;
        int i;
        for(i=0; i<size; i++){ 
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(i=0; i<size; i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String []args){

        int arr[] = {6,3,2,7,1,4};
        countSort(arr);
    }
    
}
