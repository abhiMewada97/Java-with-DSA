import java.util.Scanner;

public class two_d_array{

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        int n = matrix.length;
        int m = matrix[0].length;
        // int n = 3;
        // int m = 3;

        System.out.println("Enter 2D 9 element");
        for(int i=0; i <= n-1; i++){
            for(int j=0; j <= m-1; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i <= n-1; i++){
            for(int j=0; j <= m-1; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}
