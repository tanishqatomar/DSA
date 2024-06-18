class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        //approach 1 - brute force method
        //for(int rows[] : grid){
        //    for(int val : rows){
        //        if(val < 0){
        //            count++;
        //        }
        //    }
        //}
        //return count;
        
        //approach 2 - using binary search
        int col_len = grid[0].length;
        for(int rows[] : grid){     //sorted
            int left = 0;
            int right = col_len - 1;
            while(left <= right){
                int mid = (right + left)/2;
                if(rows[mid]<0){
                    right = mid -1;
                }else{
                    left = mid + 1;
                }
            }
            count = count + (col_len - left);
        }
        return count;
    }
}