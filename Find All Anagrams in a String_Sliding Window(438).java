class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(p.length()>s.length()){return list;}
        int[] map = new int[26];
        for(int i=0;i<p.length();i++){
            map[p.charAt(i)-97]++;
            map[s.charAt(i)-97]--;
        }
        if(helper(map)){list.add(0);}
        for(int i=p.length();i<s.length();i++){
            map[s.charAt(i)-97]--;
            map[s.charAt(i-p.length())-97]++;
            if(helper(map)){list.add(i-p.length()+1);}
        }
        return list;
        
    }
    
    public boolean helper(int[] arr){
        for(int i=0;i<26;i++){
            if(arr[i]!=0){return false;}
            
        }
        return true;
    }
}