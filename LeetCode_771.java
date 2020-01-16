class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<J.length();i++){
            map.put(J.charAt(i),0);
        }
        
        int count=0;
        for(int j=0;j<S.length();j++){
            if(map.containsKey(S.charAt(j))){
                count++;
            }
        }
        
      
        return count;
    }
}