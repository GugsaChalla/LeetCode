class Solution {
    public int titleToNumber(String s) {
    if(s.length()==1){return s.charAt(0)-64;}
    int answer=0;
    for(int i=0;i<s.length()-1;i++){
           answer=answer+calc(s.charAt(i),s.length()-i);
       }
        answer+=s.charAt(s.length()-1)-64;
        return answer;
    }
    
    public int calc(char c, int length){
        double sum=Math.pow(26,length-1);
        sum=sum*(c-64);
        return (int)sum;  
    }
}