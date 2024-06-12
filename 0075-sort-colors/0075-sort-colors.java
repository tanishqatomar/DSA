class Solution {
    void swap(int firstIndex, int secondIndex, int nums[]){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
    public void sortColors(int[] nums) {
        //three pointers problem
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high){
            int currentVal = nums[mid];
            if(currentVal == 0){
                swap(low, mid, nums); 
                mid++;
                low++;
            }else if(currentVal == 1){
                mid++;
            }else if(currentVal == 2){
                swap(mid, high, nums);
                high--;
            }
        }
    }
}