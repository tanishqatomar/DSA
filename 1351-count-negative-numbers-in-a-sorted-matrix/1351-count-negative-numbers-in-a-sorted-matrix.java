class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        //approach 1 - brute force method
        for(int rows[] : grid){
            for(int val : rows){
                if(val < 0){
                    count++;
                }
            }
        }
        return count;
    }
}