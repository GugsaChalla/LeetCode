class Solution {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        int[] next = new int[26];
        for(int ch:s.toCharArray()){
            map[ch-97]++;
        }
        for(int ch:t.toCharArray()){
            next[ch-97]++;
        }
       
        return Arrays.hashCode(map)==Arrays.hashCode(next);
    }
    
}