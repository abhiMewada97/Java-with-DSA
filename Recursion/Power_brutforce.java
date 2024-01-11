public class Power_brutforce {

    public static int powerN(int p, int n) {
        if(p==0){
            return 1;
        }
        
        return n*powerN(p-1,n);
    }

    public static void main(String []args){

        int p = 5;
        System.out.println("2 the power "+ p +" is "+powerN(p,2));
    }
}
