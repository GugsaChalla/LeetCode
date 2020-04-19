class Solution {
    public int minCostToMoveChips(int[] chips) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0,count=0,min=0,key=0,oKey=0,eKey=0,oMax=0,eMax=0,even=0,odd=0;
        for(int i=0;i<chips.length;i++){
            if(chips[i]%2==0){
                even++;
            if(map.containsKey(chips[i])){
                map.put(chips[i],map.get(chips[i])+1);
            }
            else{
                map.put(chips[i],1);
            }
            if(map.get(chips[i])>eMax){
                eMax=map.get(chips[i]);
                eKey=chips[i];
            }
        }
            else{
                odd++;
                if(map.containsKey(chips[i])){
                map.put(chips[i],map.get(chips[i])+1);
            }
            else{
                map.put(chips[i],1);
            }
            if(map.get(chips[i])>oMax){
                oMax=map.get(chips[i]);
                oKey=chips[i];
            }
            }

        }
        if(odd>even){key=oKey;}
        else{key=eKey;}
        Iterator iterator= map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator.next();
            int num = (int)mapElement.getKey();
            int val = (int)mapElement.getValue();
            if(key!=num && (key-num)%2!=0){
                min=min+val;
            }
        }
        return min;
    }
}
