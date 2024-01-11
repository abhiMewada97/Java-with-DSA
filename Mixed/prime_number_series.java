
import java.util.Scanner;

class prime_number_series {

    public static void isPrime(int i) {

        if (i == 2) {
            System.out.print("2 ");
            return;
        }

        if (i > 2) {
            boolean flag = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print prim num series ");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            isPrime(i);
        }
    }
}