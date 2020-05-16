class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0,end=nums.length-1,mid=0;
        while(start<end){
            mid=(start+end)/2;
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){return nums[mid];}
            
            if(nums[mid]!=nums[mid-1]){
                if((mid-start)%2!=0){end=mid-1;}
                else{start=mid+2;} 
            }
            
            if(nums[mid]!=nums[mid+1]){
                if((end-mid)%2!=0){start=mid+1;}
                else{end=mid-2;}
            }
            
        }
        mid=(start+end)/2;
        return nums[mid];
    }
}