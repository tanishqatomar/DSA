class Solution {
    public int majorityElement(int[] nums) {
        //hashing
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int val : nums){
            Integer count = map.get(val);
            if(count != null){
                count++;
                map.put(val, count);
            }else{
                count = 1;
                map.put(val, count);
            }if(count>nums.length/2){
                return val;
            }
        }
        return -1;
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