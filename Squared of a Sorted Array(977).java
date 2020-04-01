class Solution {
    public int[] sortedSquares(int[] A) {
        int[] arr= new int[A.length];
        int start=0,end=A.length-1;
        while(start<=end){
            if(Math.abs(A[start])>Math.abs(A[end])){
                arr[end-start]=A[start]*A[start];
                start++;
            }
            else{
                arr[end-start]=A[end]*A[end];
                end--;
            }
        }
        return arr;
    }
}
