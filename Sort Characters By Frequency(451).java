class Solution {
    public String frequencySort(String s) {
        StringBuilder str= new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{map.put(s.charAt(i),1);}
        }
      PriorityQueue<Map.Entry<Character,Integer>> heap=
            new PriorityQueue<>((o1, o2) ->   o2.getValue()-o1.getValue());
        heap.addAll(map.entrySet());
        while(!heap.isEmpty()){
            char hold=(char)heap.poll().getKey();
            while(map.get(hold)>0){
                str.append(hold);
                 map.put(hold,map.get(hold)-1);
            }
        }
        return str.toString();
    }
}