public class Clear_range_bit {
    
    public static int clearLastIBit(int n, int i, int j) {
        
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String []args) {
        
        int ans = clearLastIBit(10, 2, 7);

        System.out.print(ans);
    }
}
