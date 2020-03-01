class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[T.length];
     
        for(int i=0;i<T.length;i++){
            
            while(!stack.isEmpty() && T[stack.peek()]<T[i]){
                arr[stack.peek()]=i-stack.peek();
                stack.pop();
            }
            
            stack.push(i);        
        }
        return arr;
    }
}
