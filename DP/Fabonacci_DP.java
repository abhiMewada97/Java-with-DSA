public class Fabonacci_DP{

    public static int Memoization_Fib(int n, int arr[]) {

        if(n==1 || n==0) {
            return n;
        }

        if(arr[n] != 0) {
            return arr[n];
        }
        
        arr[n] = Memoization_Fib(n-1,arr) + Memoization_Fib(n-2,arr);

        return arr[n];
    }

    public static int tabulation_Fib(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }

    public static void main(String []args) {

        int n = 2;
        int arr[] = new int[n+1]; // by default value 0

        System.out.println(Memoization_Fib(n,arr));
        System.out.println(tabulation_Fib(n));
    }
}
