class Solution {
    public String removeOuterParentheses(String S) {
        int bool =1;
        int count=0;
        StringBuilder str  = new StringBuilder();
        
        for(int i=1;i<S.length();i++){
            if(bool==0){
                i++;
                bool=1;
            }
            if(S.charAt(i)=='('){count++;}
            if(S.charAt(i)==')'){count--;}
            
           if(bool==1&&count>-1){
               str.append(S.charAt(i));
           }
            else if(count<0){
                bool=0;
                count=0;
            }
            
        }
        return str.toString();
    }
}
