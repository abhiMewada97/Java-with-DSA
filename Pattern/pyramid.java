
public class pyramid {

    public static void main(String[] args) {

        int len = 5;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len-i+1; j++) {
                    System.out.print(j +" ");
                }

            System.out.println();
        }
    }
}
