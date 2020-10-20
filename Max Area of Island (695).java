class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    max = Math.max(max,helper(grid,i,j));
                }
            }
        }   
        return max;
    }
    
    public int helper(int[][] grid,int i,int j){
        grid[i][j]=0;
        int max =1;
        //up
        if(j+1!=grid[i].length&&grid[i][j+1]==1){
            max = max+ helper(grid,i,j+1);
        }
        //down
        if(j-1!=-1&&grid[i][j-1]==1){
            max= max+ helper(grid,i,j-1);
        }
        
        //right
        if(i+1!=grid.length&&grid[i+1][j]==1){
                max=max+ helper(grid,i+1,j);
        }
        //left
        if(i-1!=-1&&grid[i-1][j]==1){
                max = max+ helper(grid,i-1,j);
        }
        return max;
    }
}