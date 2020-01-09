class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0; 
        int end =nums.length-1;
        int mid;
        int least =-1;;
        int highest=-1;;
        while(start<=end){
                mid=(start+end)/2;
             if(nums[mid]==target){
                least=mid;
                 end=mid-1;
            }
            if(nums[mid]<target){
              
                start=mid+1;
            }
            
            else{
                  end=mid-1;
            }
        }
        start=0;
        end=nums.length-1;
        while(start<=end){
                mid=(start+end)/2;
             if(nums[mid]==target){
                highest=mid;
                 start=mid+1;
            }
            if(nums[mid]>target){
                end=mid-1;
                
            }
            
            else{
                start=mid+1;
            }
        }
       int [] arr= new int[]{least,highest};
        return arr; 
    }
}