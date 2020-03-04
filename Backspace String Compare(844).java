class Solution {
    public boolean backspaceCompare(String S, String T) {
       
        Stack<Character> stackS=new Stack<>(); 
        Stack<Character> stackT=new Stack<>(); 
        for(int i=0;i<S.length();i++){
           
            if(S.charAt(i)=='#' && stackS.isEmpty()==false){
               stackS.pop();
           }
            if(S.charAt(i)!='#'){
                stackS.push(S.charAt(i));
            }
        }
        
        for(int j=0;j<T.length();j++){
           
            if(T.charAt(j)=='#' && stackT.isEmpty()==false){
               stackT.pop();
           }
            if(T.charAt(j)!='#'){
                stackT.push(T.charAt(j));
            }
        }
            while(stackS.isEmpty()==false &&stackT.isEmpty()==false){
                if(stackS.pop()!=stackT.pop()){return false;}
            }
        if((stackS.isEmpty()==false && stackT.isEmpty()==true)|| stackT.isEmpty()==false && stackS.isEmpty()==true){
            return false;
        }
        return true;
    }
}
