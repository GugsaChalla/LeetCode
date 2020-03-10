class Solution {
    public String generateTheString(int n) {
        int og=n;
        StringBuilder str = new StringBuilder();
        while(n>1){
            str.append('a');
            n--;
        }
        if(og%2!=0){str.append('a');}
        else{str.append('b');}  
        return str.toString(); 
}
}