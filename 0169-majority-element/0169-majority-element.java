class Solution {
    public int majorityElement(int[] nums) {
        //
        int me = 0;
        int count = 0;
        for(int val : nums){
            if(count == 0){
                me = val;
                count++;
            }else if(me == val){
                count++;
            }else{
                count--;
            }
        }
        return me;
//brute force approach
//        for(int i : nums){
//          int count = 0;
//          for(int val : nums){
//              if(i == val){
//                  count++;
//              }
//          }
//          if(count> nums.length/2){
//              return i;
//          }
//      }
//      return -1;
    }
}