class Solution {
    public int countCharacters(String[] words, String chars) {
        int count=0;
        int[] map = new int[26];
        for(int i=0;i<chars.length();i++){
            map[chars.charAt(i)-'a']++;
        }
        for(int j=0;j<words.length;j++){
            int temp=0;
           int[] copy=map.clone();
            for(int k=0;k<words[j].length();k++){
                if(copy[words[j].charAt(k)-'a']>0){
                      copy[words[j].charAt(k)-'a']--;
                        temp++;
                    }
                    else{
                    temp=0;
                    break;
                }
             
            }
            count+=temp;
        }
        return count;
    }
}
