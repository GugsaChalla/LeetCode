class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int start =0,end=0,count=0;
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                if(set.size()>count) count=set.size();
                end++;
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return count;
    }
}