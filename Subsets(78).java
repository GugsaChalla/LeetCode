class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>>bigList = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,list,bigList,0);
        return bigList;
    }
    
    public void helper(int[] nums,List<Integer>list,List<List<Integer>>bigList, int index){
        bigList.add(list);
        for(int i=index;i<nums.length;i++){
            List<Integer> prev = new ArrayList<>(list);
            prev.add(nums[i]);
            System.out.println(prev);
            helper(nums,prev,bigList,i+1);
        }
    }
}