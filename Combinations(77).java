class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list,n,k,1,new ArrayList<>());
        return list;
    }
    public void dfs(List<List<Integer>> list, int n, int k, int start, List<Integer> temp){
        if(k==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<n+1;i++){
            temp.add(i);
            dfs(list,n,k-1,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}