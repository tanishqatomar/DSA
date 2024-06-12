class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //three pointer approach
        int reader1 = m-1;
        int reader2 = n-1;
        int writer = (m+n)-1;
        while(writer >= 0){ //till the writer does not reache 0th index
            //checking if reader1 and reader2 have not ended
            if(reader1 >= 0 && reader2 >= 0){   
                if(nums1[reader1] > nums2[reader2]){
                    nums1[writer] = nums1[reader1];
                    reader1--;
                }else{
                    nums1[writer] = nums2[reader2];
                    reader2--;
                }
            }
            //either array has not exhausted
            else if(reader1 >= 0){
                nums1[writer] = nums1[reader1];
                reader1--;
            }else if(reader2 >= 0){
                nums1[writer] = nums2[reader2];
                reader2--;
                
            }
            writer--;
        }
    }
}