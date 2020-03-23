class Solution {
    public String removeDuplicates(String S) {
        StringBuilder builder=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<S.length();i++){
            if(!stack.isEmpty()){
                if(stack.peek()==S.charAt(i)){
                    stack.pop();
                }
                else{
                    stack.push(S.charAt(i));
                }
                
            }
            else{
                stack.push(S.charAt(i));
            }
        }
      while(stack.isEmpty()==false){
          builder.append(stack.pop());
      }
        return builder.reverse().toString();
    }
}
