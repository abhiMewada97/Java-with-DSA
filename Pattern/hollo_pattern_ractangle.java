
public class hollo_pattern_ractangle {

    public static void main(String[] args) {

        int len = 5, brth = 4;
        for (int i = 1; i <= brth; i++) {
            for (int j = 1; j <= len; j++) {
                if (i == 1 || i == brth || j == 1 || j == len) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
