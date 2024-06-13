class Solution {
    public int[] productExceptSelf(int[] nums) {
        //compute prefix product for left to right product
        //compute suffix product for right to left product
        int left[]= new int[nums.length]; //prefix product
        int right[]= new int[nums.length];
        int finalAns []= new int[nums.length];
        left[0] = 1;
        for(int i=1; i<nums.length; i++){
            left[i] = left[i-1]* nums[i-1];
        }
        right[right.length-1]=1;
        for(int i= right.length-2; i>=0; i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i =0; i<finalAns.length; i++){
            finalAns[i]= left[i] * right[i];
        }
        return finalAns;
        /*final int n=nums.length;
        int[] ans=new int[n];
        int[] prefix= new int[n];
        int[] suffix= new int[n];
        prefix[0]=1;
        for(int i=1;i<n;++i)
            prefix[i] = prefix[i-1] * nums[i-1];
        suffix[n-1]=1;
        for(int i=n-2;i>=0;--i)
            suffix[i]=suffix[i+1] * nums[i+1];
        for(int i=0;i<n;++i)
            ans[i]=prefix[i]*suffix[i];
        return ans;*/
    }
}