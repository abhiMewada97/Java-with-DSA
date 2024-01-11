public class Ith_bit {
    
    public static int getIthBit(int n, int i) {

        int bitMask = 1<<i;
        // System.out.println(bitMask);

        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public static int setIthBit(int n, int i) {

        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {

        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit (int n, int i, int newBit) {
        
        // if(newBit==0) {
        //     return clearIthBit(n, i);
        // }
        // else {
        //     return setIthBit(n, i);
        // }

        n=clearIthBit(n,i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }

    public static void main(String []args) {

        int n=10;
        System.out.println(getIthBit(n,3));

        System.out.println(setIthBit(n,2));
        System.out.println(clearIthBit(n,1));

        System.out.println(updateIthBit(n, 2, 1));

        
    }
}
