class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res, candidates,target,new ArrayList<>(),0);
        return res;
        
    }
    
    public void dfs(List<List<Integer>> res,int[] arr, int target, List<Integer> list, int start){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        
        if(target<0) return;
        
        for(int i=start;i<arr.length;i++){
            if(i>start&&arr[i-1]==arr[i]){
                continue;
            }
            list.add(arr[i]);
            dfs(res,arr,target-arr[i],list,i+1);
            list.remove(list.size()-1);
        }
    }
}
