class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int R=0;
        int L=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                R++;
            }
            if(s.charAt(i)=='L'){
                L++;
            }
            if(R==L){
                R=0;
                L=0;
                count++;
            }
        }
        return count;
    }
}
