class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
         return count;
    }
    
    public void dfs(int i, int j, char[][] grid){
        if(i<0||j<0||i>=grid.length||j>=grid[i].length){return;}
        if(grid[i][j]=='0'){return;}
        grid[i][j]='0';
        dfs(i-1,j,grid);
        dfs(i+1,j,grid);
        dfs(i,j-1,grid);
        dfs(i,j+1,grid);
    }
   
}