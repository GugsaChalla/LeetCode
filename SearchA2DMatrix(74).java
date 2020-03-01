class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int passed=0;
        for(int i=0;i<matrix.length;i++){
            passed=0;
            for(int j=matrix[i].length-1;j>-1;j--){
                if(target>matrix[i][j]){
                    break;
                }
                if(target==matrix[i][j]){
                    return true;
                }
                passed=1;
            }
            if(passed==1){return false;}
        }
        return false;
    }
}