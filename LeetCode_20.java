class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            if(stack.isEmpty()&& (s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}')){
                return false;
            }
            if(!stack.isEmpty()){
               if(stack.peek()=='{' && s.charAt(i)=='}'){
                stack.pop();
            }
            else if(stack.peek()=='(' && s.charAt(i)==')'){
                stack.pop();
            }
            else if(stack.peek()=='[' && s.charAt(i)==']'){
                stack.pop();
            }
            else if(stack.peek()!=s.charAt(i)){return false;}
               
                
            }
            
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}