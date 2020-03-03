class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int temp;
        float counter;
        counter=A[0].length;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<=counter/2-1;j++){
                temp=A[i][j];
                A[i][j]=A[i][A.length-j-1];
                A[i][A.length-j-1]=temp;
              
                
            }
             
            for(int k=0;k<counter;k++){
                if(A[i][k]==0){
                    A[i][k]=1;
                }
                else{
                    A[i][k]=0;
                }
                
            }
           
            
        }
        return A;
    }
}
