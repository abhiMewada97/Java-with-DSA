public class Fibonacci_series {
    
    public static int fibonacciSeries(int n){

        // int a=0, b=0, c=1;
        // System.out.println(b+" ");
        // System.out.println(c+" ");
        // for(int i=1; i<n; i++){

        //     a=b;
        //     b=c;
        //     c=a+b;
        //     System.out.println(c+" ");
        // }

        if(n==0 || n==1){
            return n;
        }

        int fn1 = fibonacciSeries(n-1); 
        int fn2 = fibonacciSeries(n-2);
        int fn = fn1 + fn2;
        return fn;
    }

    public static void main(String []args){

        System.out.println(fibonacciSeries(25));
    }
}
