public class Check_twos_power {

    public static boolean checkTwosPowerOrNot(int n) {
        
        return (n & (n-1)) == 0;
    }

    public static void main(String []args) {
        
        // boolean ans = checkTwosPowerOrNot(4);  //true
        boolean ans = checkTwosPowerOrNot(3);   //false

        System.out.print(ans);
    }
}
