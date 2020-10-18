class Solution {
    public int orangesRotting(int[][] grid) {
        LinkedList<int[]> q = new LinkedList<>();
        int freshO=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    grid[i][j]=-1;
                    freshO++;
                } 
                if(grid[i][j]==2) q.add(new int[]{i,j});
            }
            
        }
        if(freshO==0) return 0;
                        //R    L.     D.    U
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        int count=0;
        q.add(null);
        while(!q.isEmpty()){
            int[] current = q.remove();
            if(current==null){
                q.add(null);
                count++;
                if(q.peek()==null){
                    return freshO==0? count-1:-1;
                } 
            }
           
           else if(grid[current[0]][current[1]]==0) continue;
            else{
                for(int i=0;i<dir.length;i++){
                    int row= current[0]+dir[i][0];
                    int col = current[1] +dir[i][1];
                    if(row<0||row>=grid.length||col<0||col>=grid[row].length) continue;
                    if(grid[row][col]==-1){
                        grid[row][col]=2;
                        q.add(new int[]{row,col});
                        freshO--;
                    } 
                }
            }
        }
        return -1;
    }
}