class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list,nums,0,new ArrayList<>());
        return list;
    }
    public void dfs(List<List<Integer>> list, int[] nums,int start,List<Integer> temp){
        list.add(new ArrayList<>(temp));
        for(int i =start; i<nums.length;i++){
            temp.add(nums[i]);
            dfs(list,nums,i+1,temp);
            temp.remove(temp.size()-1);
        }
        return;
    }

        
}