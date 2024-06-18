class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //brute force approach
        boolean flag = false;
        for(int rows[] : matrix){
            for(int val: rows){
                if(val == target){
                    flag = true;
                }
            }
        }
        if( flag == true){
            return true;
        }else{
                    return false;
                }
    }
}