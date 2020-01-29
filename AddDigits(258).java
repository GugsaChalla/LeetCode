class Solution {
    public int addDigits(int num) {
       int sum=0;
        while(num>0||sum>9){
            if(sum>9&&num<1){
                num=sum;
                sum=0;
            }
           sum=sum+(num%10);
            num=num/10;
        }
        return sum;
    }
}
