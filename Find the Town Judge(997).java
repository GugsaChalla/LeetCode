class Solution {
    public int findJudge(int N, int[][] trust) {
        if(trust.length==0){
            if(N>1){return -1;}
            return N;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<trust.length;i++){
            if(map.containsKey(trust[i][1])){
                map.put(trust[i][1],map.get(trust[i][1])+1);
            }
            else{
                map.put(trust[i][1],1);
            }
        }
        for(int i=0;i<trust.length;i++){
            if(map.containsKey(trust[i][0])){
                map.remove(trust[i][0]);
            }
        }
        Iterator hmIterator = map.entrySet().iterator(); 
        while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            int count = ((int)mapElement.getValue()); 
            if(count==N-1){return ((int)mapElement.getKey());}
        }
        return -1;
    }
}