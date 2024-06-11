class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> arr;
        int m=nums1.size(),n=nums2.size();
        int i=0, j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]) arr.push_back(nums1[i++]);
            else arr.push_back(nums2[j++]);
        }
        while(i<m) arr.push_back(nums1[i++]);
        while(j<n) arr.push_back(nums2[j++]);
        int num= (m+n);
        if(num%2==1){
            return arr[num/2];
        }
        return (double)((double)(arr[num/2])+(double)(arr[(num/2)-1]))/2.0;
    }
};