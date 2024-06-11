class Solution {
    boolean board[][];
    boolean canIPlaceAQueen(int row, int col){
        //checking upper row
        for(int i = row; i >= 0; i--){
            if(board[i][col]){
                return false;
            }
        }
        //checking upper left diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j])
                return false;
        }
        //upper right diagonal
        for(int i = row, j = col; i >= 0 && j < board[0].length; i--, j++){
            if(board[i][j])
                return false;
        }
        return true;
    }
    int queenHelper(int row, int n){
        //base case
        if(row == n){
            return 1;
        }
        int count=0;
        for(int col = 0; col < n; col++){
            if(canIPlaceAQueen(row, col)){
                //place the queen
                board[row][col]=true;
                count = count + queenHelper(row + 1, n);
                //backtrack
                board[row][col]=false;
            }
        }
        return count;
    }
    public int totalNQueens(int n) {
        board = new boolean[n][n];
        return queenHelper(0,n);
    }
}