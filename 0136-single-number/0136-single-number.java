class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        // Check adjacent elements
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        // If no element is found till the second last element, return the last element
        return nums[nums.length - 1];
    }
}