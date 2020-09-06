class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, ArrayList> map= new HashMap<>();
        ArrayList<List<String>> list= new ArrayList<>();
        
        for(int i=0;i<strs.length;i++){
            int hashCode=helper(strs[i]);
            if(map.containsKey(hashCode)){
                map.get(hashCode).add(strs[i]);
            }
            else{
                map.put(hashCode, new ArrayList<String>());
                map.get(hashCode).add(strs[i]);
            }
        }
        
        Iterator iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry anagram= (Map.Entry) iterator.next();
            list.add((ArrayList<String>) anagram.getValue());
        }
        
        return list;
    }
    
    public int helper(String word){
        char[] map=new char[26];
        for(int i=0;i<word.length();i++){
            map[word.charAt(i)-97]++;
        }
        return Arrays.hashCode(map);
    }
}