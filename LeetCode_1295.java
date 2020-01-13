class Solution {
    public int findNumbers(int[] nums) {
        int count;
        int total=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            int num = nums[i];
            while(num>0){
                num/=10;
                count++;
            }
            if(count%2==0){
                total++;
            }
        }
        return total;
        
    }
}