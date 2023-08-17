public class spiral_matrix {

    public static void spiral(int matrix[][]){
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        int startrow=0,startcol=0;

        while(endrow >= startrow && endcol >= startcol){
            // top
            for(int i = startcol; i <= endcol; i++) {
                System.out.print(matrix[startrow][i] +" ");            
            }
            
            // right
            for(int i = startrow+1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] +" ");            
            }

            // bottom
            for(int i = endcol-1; i >= startcol; i--) {
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][i] +" ");            
            }

            // left
            for(int i = endrow-1; i >= startrow+1; i--) {
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol] +" ");            
            }
            endrow--;
            endcol--;
            startrow++;
            startcol++;
        }
    }

    public static void main(String []args){

        int matrix [][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        spiral(matrix);
        
    }

    // public static void spiral(int matrix[][]){
    //     int startRow = 0;
    //     int startCol = 0;
    //     int endRow = matrix.length-1;
    //     int endCol = matrix[0].length-1;

    //     while(startRow<=endRow && startCol<=endCol){
    //         //top boundry
    //         for(int j=startCol;j<=endCol;j++){
    //             System.out.print(matrix[startRow][j]+" ");

    //         }

    //         //right Boundary
    //         for(int i=startRow+1;i<=endRow;i++){
    //             System.out.print(matrix[i][endCol]+" ");
    //         }

    //         //bottom boundary
    //         for(int j=endCol-1;j>=startCol;j--){
    //             if(startRow == endRow){
    //                 break;
    //             }
    //             System.out.print(matrix[endRow][j]+" ");

    //         }

    //         //left boundary
    //         for(int i=endRow-1;i>=startRow+1;i--){
    //             if(startCol == endCol){
    //                 break;
    //             }
    //             System.out.print(matrix[i][startCol]+" ");
    //         }

    //         startCol++;
    //         startRow++;
    //         endCol--;
    //         endRow--;

    //     }

    //     System.out.println();

    // }
    // public static void main(String args[]){
    //     int matrix[][] = {{1,2,3,4},
    //                         {5,6,7,8},
    //                         {9,10,11,12},
    //                         {13,14,15,16}};
    //     spiral(matrix);



    // }
}