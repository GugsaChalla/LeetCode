class Solution {
    public boolean judgeCircle(String moves) {
        int side=0, vertical=0,count=moves.length();
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R'){
                side++;
                count--;
                if(side>count){return false;}
            }
            else if(moves.charAt(i)=='L'){
                side--;
                count--;
            }
            else if(moves.charAt(i)=='U'){
                vertical++;
                count--;
                if(vertical>count){return false;}
            }
            else if(moves.charAt(i)=='D'){
                vertical--;
                count--;
            }
        }
        if(vertical==0&&side==0){
            return true;
        }
        return false;
    }
}