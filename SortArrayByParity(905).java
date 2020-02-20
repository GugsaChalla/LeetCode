class Solution {
    public int[] sortArrayByParity(int[] A) {
        int hold =0;
        int temp;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                temp=A[hold];
                A[hold]=A[i];
                A[i]=temp;
                hold++;
            }
            
        }
        return A;
    }
}
