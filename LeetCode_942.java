class Solution {
    public int[] diStringMatch(String S) {
        int[] arr = new int[S.length()+1];
        int prev=0;
        int dec=S.length();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='I'){
                arr[i]=prev;
                prev++;
                
            }
            else{
                 arr[i]=dec;
                dec--;
            }
        }
        if(S.charAt(S.length()-1)=='I'){
            arr[arr.length-1]=prev;
        }
        else{
            arr[arr.length-1]=dec;
        }
        return arr;
    }
}