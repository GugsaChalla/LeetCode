class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                if(!map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),i);
                }
                else{
                    map.remove(s.charAt(i));
                    set.add(s.charAt(i));
                }
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.containsValue(i)){
                return i;
            }
        }
        return -1;
    }
}