class Solution {
    static void subsHelper(int[] nums, List<Integer> smallList, List<List<Integer>> finalList,int index){
        finalList.add(new ArrayList<>(smallList));       
        for(int i = index; i<nums.length; i++){
            if(!smallList.contains(nums[i])){
                smallList.add(nums[i]);
                subsHelper(nums,smallList,finalList,i);
                //backtrack (undo)
                smallList.remove(smallList.size()-1);
            }
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        subsHelper(nums, smallList, finalList,0);
        return finalList;
    }
}