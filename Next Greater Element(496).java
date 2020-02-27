class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        Arrays.fill(arr,-1);
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
       for(int a=0;a<nums1.length;a++){
               map.put(nums1[a],a);
       }
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty()&& nums2[stack.peek()]<nums2[i]) {
                arr[map.get(nums2[stack.peek()])]=nums2[i];
                stack.pop();
            }
                  if(map.containsKey(nums2[i])){
                      stack.push(i);
                  }
        
    }
        return arr;
                  
                  }
}
