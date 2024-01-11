public class Climbing_stairs {

    public static int countWay(int n) {

        if(n==0){
            return 1;
        }

        if(n<0) {
            return 0;
        }

        return countWay(n-1) + countWay(n-2);
    }

    public static int countWayMemoization(int n, int arr[]) {
        
        if(n==0){
            return 1;
        }
        
        if(n<0) {
            return 0;
        }

        if(arr[n]!=0) {
            return arr[n];
        }

        // arr[n] = countWayMemoization(n-1,arr) + countWayMemoization(n-2,arr) + countWayMemoization(n-3,arr);
        arr[n] = countWayMemoization(n-1,arr) + countWayMemoization(n-2,arr);

        return arr[n];
    }

    public static int countWayTabulation(int n) {

        if(n==0 || n==1){
            return n;
        }

        int arr[] = new int[n+1];

        arr[0] = 1;
        arr[1] = 1;
        
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }
    
    public static void main(String []args) {

        int n =3;
        int arr[] = new int[n+1];
        
        System.out.println(countWay(n));
        System.out.println(countWayMemoization(n, arr));
        System.out.println(countWayTabulation(n));
    }
}
