class Solution {
    public int fib(int N) {
        int[] arr= new int[N+1];
        
        if(N==0){ return 0;}
        if(N==1){return 1;}
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[N];
    }
}