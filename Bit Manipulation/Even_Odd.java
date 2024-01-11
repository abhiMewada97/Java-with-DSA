public class Even_Odd {

    public static void evenOrOdd(int n) {
        int bitMask = 1;

        if(1 == (n & bitMask)) {
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }
    }

    public static void main(String []args) {

        evenOrOdd(000101);
        evenOrOdd(11);
        evenOrOdd(14);

    }    
}
