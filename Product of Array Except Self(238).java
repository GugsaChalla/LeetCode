class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] arr = new int[nums.length];
        int leftProd=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=leftProd;
            leftProd=leftProd*nums[i];
        }
        int rightProd=1;
        for(int j=nums.length-1;j>-1;j--){
            arr[j]=rightProd*arr[j];
            rightProd=rightProd*nums[j];
        }
        return arr;
    }
}
