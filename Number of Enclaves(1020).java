/**
0000
1010
0110
0000
*/
class Solution {
    public int numEnclaves(int[][] A) {
        if(A.length==0){return 0;}
        for(int i=0;i<A[0].length;i++){
           
            if(A[0][i]==1){
                helper(A,0,i);
            }
            if(A[A.length-1][i]==1){
                helper(A,A.length-1,i);
            }
        }
        
        for(int i=0;i<A.length;i++){
            if(A[i][0]==1){
                helper(A,i,0);
            }
            if(A[i][A[0].length-1]==1){
                helper(A,i,A[0].length-1);
            }
        }
        int count=0;
         for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]==1){
                    count++;
                }
            }
        }
        return count;
        

    }
    
     public void helper(int[][] A, int i, int j){
        if(i<0||j<0||i>=A.length||j>=A[i].length){return;}
        if(A[i][j]==0){return;}
         
        A[i][j]=0;
        helper(A,i-1,j);
        helper(A,i+1,j);
        helper(A,i,j-1);
        helper(A,i,j+1);
        
    }
        
}
    
   
