class Solution {
    public double myPow(double x, int n) {
        if(n==0){return 1;}
        if(n%2==0){
            double y= myPow(x,n/2);
            return y*y;
        }
        if(n>0&&n%2!=0){
            return x*myPow(x,n-1);
        }
        else{
            return (1/x)*myPow(x,n+1);
        }
         
    }
   
}