class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        
        String[] arrA=A.split(" ");
        String[] arrB=B.split(" ");
        HashMap<String,Integer>map= new HashMap<>();
        
        for(int i=0;i<arrA.length;i++){
            if(map.containsKey(arrA[i])){
                map.put(arrA[i],map.get(arrA[i])+1);
            }
            
            else{
                map.put(arrA[i],0);
            }
        }
        
        for(int j=0;j<arrB.length;j++){
            if(map.containsKey(arrB[j])){
                map.put(arrB[j],map.get(arrB[j])+1);
            }
            else{
                map.put(arrB[j],0);
            }
        }
        
        int spot=0;
        Iterator iter= map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry=(Map.Entry) iter.next();
            int value=(int) entry.getValue();
            if(value==0){
                spot++;
            }
        }
        
        String[] res = new String[spot];
        spot=0;
        Iterator iter2= map.entrySet().iterator();
        while(iter2.hasNext()){
            Map.Entry entry=(Map.Entry) iter2.next();
            int values=(int) entry.getValue();
            if(values==0){
                res[spot]=(String) entry.getKey();
                spot++;
            }
        }
        return res;
    }
}
