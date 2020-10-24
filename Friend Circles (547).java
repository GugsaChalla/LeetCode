class Solution {
    public int findCircleNum(int[][] M) {
        	int count=0;
	boolean visited[] = new boolean [M.length];
	for(int i=0;i<M.length;i++){
	if(visited[i]==false){
	count++;
	dfs(M,visited,i);
    }
}
return count;
    }
    public void dfs(int[][]M, boolean[] visited,int i){
	    if(visited[i]==true) return;
	    visited[i]=true;
	    for(int j=0;j<M[i].length;j++){
	        if(M[i][j]==1){
	            dfs(M,visited,j);
            }
        }
    }
