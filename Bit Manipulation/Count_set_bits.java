public class Count_set_bits {
    
    public static int countBits(int n) {
        
        int count = 0;
        while (n>0) {
            
            if( (n & 1) != 0) {
                count++;
            }
            n = n>>1;
        }

        return count;
    }

    public static void main(String []args) {
    
        int ans = countBits(16);

        System.out.print(ans);
    }
}
