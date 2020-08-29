class Solution {
    public boolean exist(char[][] board, String word) {
        if(word.length()>board.length*board[0].length) return false;
        
        boolean[] path = new boolean[word.length()];
        
        for (int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0)) helper(board,i,j,0, word, path);
                if(path[word.length()-1]==true) return true;    
            }    
        }
    
        return false;
    }
    
    public void helper(char[][] board, int i, int j, int count, String word, boolean[] path){
        if(path[word.length()-1]==true) return;
        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 || board[i][j]==' ') return;
        if(board[i][j]!=word.charAt(count)) return;
        
        char oldChar = board[i][j];
        path[count]=true;
        board[i][j]=' ';
        
        helper(board,i-1,j,count+1,word,path);
        helper(board,i+1,j,count+1,word,path);
        helper(board,i,j-1,count+1,word,path);
        helper(board,i,j+1,count+1,word,path);
          
        if(path[word.length()-1]!=true) board[i][j]=oldChar;
        
    }
}