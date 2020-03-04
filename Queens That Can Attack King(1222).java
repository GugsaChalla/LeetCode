class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> fin = new ArrayList<>();
        int minRightrow=9;
        int minRightdown=9;
        int minRightUp=9;
        int minLeftrow=9;
        int minLeftdown=9;
        int minLeftUp=9;
        int minUpColumn=9;
        int minDownColumn=9;
        boolean A=false;
        boolean B=false;
        boolean C=false;
        boolean D=false;
        boolean E=false;
        boolean F=false;
        boolean G=false;
        boolean H=false;
         List<Integer> rightRow = new ArrayList<>();
         List<Integer> rightDown = new ArrayList<>();
        List<Integer> rightUp = new ArrayList<>();
        List<Integer> LeftRow = new ArrayList<>();
        List<Integer> LeftDown = new ArrayList<>();
        List<Integer> LeftUp = new ArrayList<>();
        List<Integer> UpSame = new ArrayList<>();
        List<Integer> DownSame = new ArrayList<>();
        for(int i=0;i<queens.length;i++){
            //Right
            if(queens[i][1]>king[1]){
                //RightSame
                if(queens[i][0]==king[0]){
                    if(minRightrow>Math.abs(queens[i][1]-king[1])){
                    A=true;
                    minRightrow=Math.abs(queens[i][1]-king[1]);
                     rightRow = new ArrayList<>();
                    rightRow.add(queens[i][0]);
                    rightRow.add(queens[i][1]);
                    } 
                    
                }
                //RightDown
                if(queens[i][0]<king[0]){
                    if(Math.abs(queens[i][0]-king[0])==Math.abs(queens[i][1]-king[1])){
                         if(minRightdown>Math.abs(queens[i][0]-king[0])){
                             B=true;
                            minRightdown=Math.abs(queens[i][0]-king[0]);
                            rightDown = new ArrayList<>();
                            rightDown.add(queens[i][0]);
                            rightDown.add(queens[i][1]);
                         }
                    }
                }
                //RightUp
                if(queens[i][0]>king[0]){
                    if(Math.abs(queens[i][0]-king[0])==Math.abs(queens[i][1]-king[1])){
                        if(minRightUp>Math.abs(queens[i][0]-king[0])){
                             C=true;
                            minRightUp=Math.abs(queens[i][0]-king[0]);
                            rightUp = new ArrayList<>();
                            rightUp.add(queens[i][0]);
                            rightUp.add(queens[i][1]);
                         }
                    }
                }
                
            }
            //Left
            if(queens[i][1]<king[1]){
                //LeftSame
                if(queens[i][0]==king[0]){
                    if(minLeftrow>Math.abs(queens[i][1]-king[1])){
                     D=true;
                    minLeftrow=Math.abs(queens[i][1]-king[1]);
                    LeftRow = new ArrayList<>();
                    LeftRow.add(queens[i][0]);
                    LeftRow.add(queens[i][1]);
                    } 
                    
                }
                //LeftDown
                 if(queens[i][0]<king[0]){
                    if(Math.abs(queens[i][0]-king[0])==Math.abs(queens[i][1]-king[1])){
                         if(minLeftdown>Math.abs(queens[i][0]-king[0])){
                            E=true;
                            minLeftdown=Math.abs(queens[i][0]-king[0]);
                            LeftDown = new ArrayList<>();
                            LeftDown.add(queens[i][0]);
                            LeftDown.add(queens[i][1]);
                         }
                    }
                }
                //LeftUp
                if(queens[i][0]>king[0]){
                    if(Math.abs(queens[i][0]-king[0])==Math.abs(queens[i][1]-king[1])){
                        if(minLeftUp>Math.abs(queens[i][0]-king[0])){
                            F=true;
                            minLeftUp=Math.abs(queens[i][0]-king[0]);
                            LeftUp = new ArrayList<>();
                            LeftUp.add(queens[i][0]);
                            LeftUp.add(queens[i][1]);
                         }
                    }
                }
            }
            //UpSame
            if(queens[i][0]>king[0]){
                if(queens[i][1]==king[1]){
                    if(minUpColumn>Math.abs(queens[i][0]-king[0])){
                        G=true;
                        minUpColumn=Math.abs(queens[i][0]-king[0]);
                        UpSame = new ArrayList<>();
                        UpSame.add(queens[i][0]);
                        UpSame.add(queens[i][1]);
                    }
                }
            }
            //DownSame
            if(queens[i][0]<king[0]){
                if(queens[i][1]==king[1]){
                    if(minDownColumn>Math.abs(queens[i][0]-king[0])){
                        H=true;
                        minDownColumn=Math.abs(queens[i][0]-king[0]);
                        DownSame = new ArrayList<>();
                        DownSame.add(queens[i][0]);
                        DownSame.add(queens[i][1]);
                    }
                }
            }
        }
        if(A==true){fin.add(rightRow);}
        if(B==true){fin.add(rightDown);}
        if(C==true){fin.add(rightUp);}
        if(D==true){fin.add(LeftRow);}
        if(E==true){fin.add(LeftDown);}
        if(F==true){fin.add(LeftUp);}
        if(G==true){fin.add(UpSame);}
        if(H==true){fin.add(DownSame);}
        
        return fin;
    }
}