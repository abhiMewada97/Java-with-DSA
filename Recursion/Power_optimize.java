public class Power_optimize {
    
    public static int powerN(int p, int n) {
        if(p==0){
            return 1;
        }

        int halfPower = powerN(p/2,n);
        int halfPowerSq = halfPower * halfPower;

        if(p%2!=0) {
            halfPowerSq = n*halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String []args){

        int p = 5;
        int n = 2;
        System.out.println("2 the power "+ p +" is "+powerN(p,n));
    }
}
