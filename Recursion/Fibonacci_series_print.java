public class Fibonacci_series_print {

    int a = 0, b=1, c=0;

    public void fibonacciSeries(int n) {
        
        // if(n==0 || n==1) {
        //     System.out.println(n);
        // }     
        if(n<=0){
            return;
        }
        
        System.out.print(c+" ");
        a=b;
        b=c;
        c=a+b;
        fibonacciSeries(n-1);
    }
   

    public static void main(String []args) {

        Fibonacci_series_print x = new Fibonacci_series_print();
        int n = 25;
        x.fibonacciSeries(n);
    }

}
