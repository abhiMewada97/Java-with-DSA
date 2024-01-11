import java.util.*;

public class first {

//    n= 5

// arr[n] = 1 4 3 2 5

// k=3


// 6

// 1 3 5 2 4 6

// 4
    public static int countIndex(int n, int k, int arr[]) {

        // for (int i = 0; i < n; i++) {
        //     if(k==arr[i]){
        //         k=i;
        //     }
        // }

        for(int i=0; i<n; i++) {

            int max = arr[0];
            int mi=0;

            for (int j=1; j<n; j++) {

                if(max < arr[j]){
                    
                    max = arr[j] ;
                    mi = j;
                }
            }
            
            if(mi==k) {
                return i+1;
            }

            arr[mi]=0;

            for(int j=mi-1; j>=0; j--) {

                if(arr[j]!=0){

                    ++arr[j];
                }
            }
        }
        return 0;
    }
    
    public static void main(String []args) {

        int n,k;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {

            arr[i] = sc.nextInt();
        }

        k = sc.nextInt();

        int ans = countIndex(n, k-1, arr);
        System.out.print(ans);
    }
}
