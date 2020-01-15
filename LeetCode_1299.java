class Solution {
    public int[] replaceElements(int[] arr) {
        int max=0;
        int last=-1;
        for(int i=0;i<arr.length-1;i++){
            int hold=i;
            for(int j=i+1;j<arr.length;j++){
                if(j==i+1){
                    max=arr[j];
                }
               else if(max<arr[j]){
                    max=arr[j];
                   hold=j;
                }
            }
            while(hold>last){
                arr[hold]=max;
                hold--;
                
            }
            last=hold+1;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}