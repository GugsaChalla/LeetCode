class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int start=0,end=0,count=0;
        int res=nums.length+1;
        
        while(start<nums.length){
            if(count>=s){
                if(end-start<res)res=end-start;
                count=count-nums[start];
                start++;
            }
            else if(end==nums.length)start++;
            else{
                count+=nums[end];
                end++;
            } 
        }
        
        if(res>nums.length) return 0;
        return res;
    }
}