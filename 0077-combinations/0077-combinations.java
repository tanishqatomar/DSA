class Solution {
    void comHelper(int n, int k, List<Integer> smallList, List<List<Integer>> finalList, int num){
        if(smallList.size()==k){
            finalList.add(new ArrayList<Integer>(smallList));
            return;
        }
        for(int i=num;i<=n;i++){
            //if(!smallList.contains(i)){
                smallList.add(i);
                comHelper(n,k,smallList,finalList,i+1);
                smallList.remove(smallList.size()-1);
            //}
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> finalList= new ArrayList<>();
        comHelper(n,k,smallList,finalList,1);
        return finalList;
    }
}