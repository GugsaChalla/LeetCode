class Solution {
    public int minAddToMakeValid(String S) {
        int count=0;
        boolean close=true;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
            stack.push(S.charAt(i));
                count++;
            }
            else if(!stack.isEmpty()&&S.charAt(i)==')'){
                 count--;
                stack.pop();
             }
           else if(stack.isEmpty()&&S.charAt(i)==')'){
                count++;
            }
            
           
        }
        return count;
    }
}
