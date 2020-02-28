class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            if(target==nums[mid]){
                return mid;
            }
        }
        return -1;
    }
}
