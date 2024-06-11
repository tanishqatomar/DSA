class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg=Double.MIN_VALUE;
        //sum of first k size window
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAvg=sum*1.0/k;
        //avg for the remaining windows
        for(int i=k;i<nums.length; i++){
            sum=sum+nums[i]-nums[i-k];
            maxAvg=Math.max(maxAvg,1.0*sum/k);
        }
        return maxAvg;
    }
}