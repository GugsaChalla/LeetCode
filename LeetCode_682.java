


class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer> stack = new Stack<Integer>(); 
        
        int num;
        int hold;
        int sum=0;
        for(int i=0;i<ops.length;i++){
           if(ops[i].equals("C")){
                stack.pop();
            }
            
          else  if(ops[i].equals("D")){
                num=stack.peek();
                stack.push(num*2);
            }
            
           else if(ops[i].equals("+")){
                hold=stack.pop();
                num=stack.peek();
                num=num+hold;
                stack.push(hold);
                stack.push(num);
            }
       else{
                num=Integer.parseInt(ops[i]);
                stack.push(num);
            }
        }
        while(stack.isEmpty()!=true){
            sum=sum+stack.pop();
        }
        return sum;
    }
}