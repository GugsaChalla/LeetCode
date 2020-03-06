class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        int[] map = new int [1001];
        
        for(int i=0;i<arr1.length;i++){
            map[arr1[i]]++;
        }
        
        int j=0;
        for(int i=0;i<arr2.length;i++){
                int cond = map[arr2[i]];
                while(map[arr2[i]]>0){
                  arr[j]=arr2[i];
                  j++;
                  map[arr2[i]]--;
                }
        }
    
        for(int i=0;i<map.length;i++){
            while(map[i]>0){
               arr[j]=i;
               j++; 
                map[i]--;
            }
            if(j==arr.length){break;}
        }
        
        return arr;
    }
}