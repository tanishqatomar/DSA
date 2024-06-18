class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        //maintain list of minimums in rows
        List<Integer> minRow = new ArrayList<>();
        //maintain list of maximums in columns
        List<Integer> maxCol = new ArrayList<>();
        int minRowElement = Integer.MAX_VALUE;
        int maxColElement = Integer.MIN_VALUE;
        for(int rows[] : matrix){
            for(int val : rows){
                minRowElement = Math.min(minRowElement,val);
            }
            minRow.add(minRowElement);
            minRowElement = Integer.MAX_VALUE;
        }
        //collect max col elements
        for(int col = 0; col<matrix[0].length; col++){
            for(int row =0; row< matrix.length; row++){
                maxColElement = Math.max(maxColElement,matrix[row][col]);
            }
            maxCol.add(maxColElement);
            maxColElement = Integer.MIN_VALUE;
        }
        List<Integer> ans = new ArrayList<>();
        for(int val : minRow){
            if(maxCol.contains(val))
                ans.add(val);
        }
        return ans;
    }
}