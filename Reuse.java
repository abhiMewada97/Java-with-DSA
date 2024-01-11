class Solution {
    public static void nStarDiamond(int n) {
        // Write your code here

        for(int i=0; i<n; i++) {

            //space
            for(int j=n-i; j>1; j--) {
                System.out.print(" ");
            }
            
            // star
            for(int j=0; j<i*2+1; j++) {
                System.out.print("*");
            }
            
            // space
            for(int j=n-i; j>1; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }

        for(int i=n-1; i>=0; i--) {

            //space
            for(int j=n-i; j>1; j--) {
                System.out.print(" ");
            }
            
            // star
            for(int j=0; j<i*2+1; j++) {
                System.out.print("*");
            }
            
            // space
            for(int j=n-i; j>1; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}


public class Reuse {
    public static void main(String []args) {
        
        Solution l = new Solution();
        l.nStarDiamond(3);
    }
}