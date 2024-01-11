
public class butter_fly_pattern {
    
    public static void butter_fly_pattern(int len){

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= i; j++) {
                
                System.out.print("* ");
            }
            int k = i+1;
            for (; k <= (len*2)-i; k++) {
                
                System.out.print("  ");
            }
            for (; k <= len*2; k++) {
                
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = len; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                
                System.out.print("* ");
            }
            int k = i+1;
            for (; k <= (len*2)-i; k++) {
                
                System.out.print("  ");
            }
            for (; k <= len*2; k++) {
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int len = 5;
        butter_fly_pattern(len);
        
    }
}
