class Solution {
    public int findComplement(int num) {
        Stack<Integer> stack = new Stack<>();
        double sum=0;
        double count=-1;

        while(num!=0){
            if(num%2==0){
                stack.push(1);
            }
            else{
                stack.push(0);
            }
            
            num=num/2;
            count++;
        }
        
        while(!stack.isEmpty()){
            sum=sum+stack.pop()*Math.pow(2,count);
            count--;
        }
        
        int res = (int)sum;
        return res;
    }
}