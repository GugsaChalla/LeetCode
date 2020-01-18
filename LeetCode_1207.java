class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                count++;
                map.put(arr[i],1);
            }
        }
         Iterator iterator = map.entrySet().iterator(); 
  
        int[] hold = new int[count];
        count=0;
        while (iterator.hasNext()) { 
            Map.Entry entry = (Map.Entry) iterator.next(); 
            hold[count]=((int) entry.getValue()); 
            count++;
        } 
        for(int j=0;j<hold.length;j++){
            for(int k=j+1;k<hold.length;k++){
                if(hold[j]==hold[k]){
                    return false;
                }
            }
        }
        return true;
    }
}