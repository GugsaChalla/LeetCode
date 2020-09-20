class Solution {
    
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        s = s.trim();
        String [] sentence = s.split(" ");
        for(int i=sentence.length-1;i>-1;i--){
            if(sentence[i].length()==0)continue;
            str.append(sentence[i]);
            if(i==0)break;
            str.append(" ");
        }
        return str.toString();
    }
}