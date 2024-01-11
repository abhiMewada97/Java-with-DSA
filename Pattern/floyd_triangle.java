
public class floyd_triangle {
    
    public static void main(String[] args) {

        int len = 5,k=1;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(k +" ");
                    k++;
                }

            System.out.println();
        }
    }
}
