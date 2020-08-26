class Solution {
    public int numRookCaptures(char[][] board) {
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==('R')){
                    helper(i,j,board,'r');
                }
            }
        }
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='E'){
                    count++;
                }
            }
        }
        
        return count;
       
    }
    
    public void helper(int i, int j, char[][] board, char past){
        if(i>board.length-1||i<0||j<0||j>board[i].length-1) return;
        if(board[i][j]=='B') return;
        if(board[i][j]=='E') return;
        if(board[i][j]=='p'){
            board[i][j]='E';
            return;
        }
        if(past=='U'||past=='r'){
            helper(i-1,j,board,'U');
        }
        
        if(past=='D'||past=='r'){
            helper(i+1,j,board,'D');
        }
        
        if(past=='L'||past=='r'){
            helper(i,j-1,board,'L');
        }
        
        if(past=='R'||past=='r'){
            helper(i,j+1,board,'R');
        }
        
    }
}