class Solution {
    public int removeElement(int[] nums, int val) {
        //two pointer approach
        int reader = 0; //always moves
        int writer = 0; //moves only when it is not equal to val
        while(reader < nums.length){
            if(nums[reader] == val){
                reader++;
            }else{
                nums[writer] = nums[reader];
                reader++;
                writer++;
            }
        }
        return writer;
    }
}