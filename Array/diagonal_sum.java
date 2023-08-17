public class diagonal_sum {

    public static void diagonalSum(int matrix[][]){

        int sum=0, size=matrix.length;

        for(int i = 0; i < size; i++) {
            sum += matrix[i][i];

            if(i != (size-1)-i)
            sum += matrix[i][(size-1)-i];
        }
        // for(int i = ; i < matrix.length; i++) {
        //     sum += matrix[i][i];
        // }
        System.out.print(sum +" ");            
    }

    public static void main(String []args){

        int matrix [][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        diagonalSum(matrix);
    }  
}
