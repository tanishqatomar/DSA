class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length; 
        if (n <= 1) 
            return;
        k=k % n;
        if (k == 0) 
            return;
        //bringing the back digits to the front
        reverse(nums, 0, n-1);
        //rotating the first k digits
        reverse(nums, 0, k-1);
        // rotating the remaining digits
        reverse(nums, k, n-1);
    }
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}