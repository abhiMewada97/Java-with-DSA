public class Clear_last_i_bit {

    public static int clearLastIBit(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String []args) {
        
        int ans = clearLastIBit(15, 2);

        System.out.print(ans);
    }
}
