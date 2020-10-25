class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list,candidates,target,0,new ArrayList<>());
        return list;
    }
    public void dfs(List<List<Integer>> list, int[] arr, int target,int start, List<Integer> temp){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<arr.length;i++){
            temp.add(arr[i]);
            dfs(list,arr,target-arr[i],i,temp);
            temp.remove(temp.size()-1);
        }
    }
}