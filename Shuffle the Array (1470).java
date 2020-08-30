class Solution {
    public int[] shuffle(int[] nums, int n) {
      
      int[] arr = new int[nums.length];
        
      for (int i = 0; i < nums.length; i++){
          if(i % 2 == 0 ) arr[i]=nums[i/2];
          else arr[i] = nums[i/2 + n];
      }
          
	  return arr;
    }
}
