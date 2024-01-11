public class Fast_exponential {
    
    public static int pow(int n, int p) {
        
        int ans = 1;
        while (p>0) {
            
            if( (p & 1) != 0) {
                ans = ans * n;
            }
            n = n * n;
            p = p>>1;
        }

        return ans;
    }

    public static void main(String []args) {
    
        int ans = pow(3,5);

        System.out.print(ans);
    }
}
