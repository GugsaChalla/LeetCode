class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){return false;}
        int[] map = new int[26];
        for(int i=0;i<s1.length();i++){
            map[s1.charAt(i)-97]++;
            map[s2.charAt(i)-97]--;
        }
        if(helper(map)==true){return true;}
        
        for(int i=s1.length();i<s2.length();i++){
            map[s2.charAt(i)-97]--;
            map[s2.charAt(i-s1.length())-97]++;
            if(helper(map)==true){return true;}
        }
        return false;
    }
    
    public boolean helper(int[] arr){
        for(int i=0;i<26;i++){
            if(arr[i]!=0){return false;}
        }
        return true;
    }
}