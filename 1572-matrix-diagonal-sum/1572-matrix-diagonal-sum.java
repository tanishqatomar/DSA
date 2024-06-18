class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for( int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                if(row == col){
                    sum = sum + mat[row][col];
                }
                if((row + col) == (n - 1)){
                    sum = sum + mat[row][col];
                }
            }
        }
        if(n % 2 != 0){
            sum = sum - mat[n/2][n/2];
        }
        return sum;
    }
}