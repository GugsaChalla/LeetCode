class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int min =100001;
        int max=0;
        List<Integer> list = new ArrayList<>();
        int minimum[] = new int[matrix.length];
        int column[] = new int[matrix.length];
        
        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[i].length;j++){
                
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    minimum[i]=min;
                    column[i]=j;
                }
                
            }
            
            min= 100001;
        }
        
        for(int i=0;i<column.length;i++){
            
            for(int j=0;j<column.length;j++){
                
                if(matrix[j][column[i]]>minimum[i]){
                    break;
                }
                
                if(j==column.length-1){
                    list.add(minimum[i]);
                }
            }
                
        }
        
        return list;
    }
    
}