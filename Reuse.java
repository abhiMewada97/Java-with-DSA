class Reuse {

    static int count=0;
    public static int totalNQueens(int n) {
        if(n==1) {
            return 1;
        }
        char [][]board = new char[n][n];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
        
        return count;
    }
    
    public static void nQueens(char board[][], int row){
        
        if(row == board.length){
            count++;
            return;
        }

        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'x';
            }
        }
    }

     public static boolean isSafe(char board[][],int row, int col){
        
        // verticaly up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        
        // left diagonal up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // right diagonal up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}