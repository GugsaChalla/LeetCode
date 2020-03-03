class Solution {
    public int[] sumZero(int n) {
        int num=0;
        int[] arr = new int[n];
        if(n%2==0){
            for(int i=0;i<n;i++){
                if(i%2==0){
                num=num-1;
                arr[i]=num;
                }
                else{
                    arr[i]=Math.abs(num);
                }
                
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(i%2==0){
                arr[i]=num;
                num--;
                }
                else{
                  arr[i]=Math.abs(num);  
                }
                
            }
        }
        return arr;
    }
}