class Solution {
    public int[] decompressRLElist(int[] nums) {
        int count=0;
        for (int k=0;k<nums.length;k+=2){
            count+=nums[k];
        }
        int j=0;
        int[] arr= new int[count];
        for(int i=0;i<nums.length;i=i+2){
            while(nums[i]>0){
                arr[j]=nums[i+1];
                j++;
                nums[i]--;
            }
        }
        return arr;
}
}