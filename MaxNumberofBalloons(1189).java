class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] map = new int[26];
        int max=0;
        for(int i=0;i<text.length();i++){
            map[(int) text.charAt(i)-97]++;
        }
        max=map[0];
        if(map[1]<max){
            max=map[1];
        }
        if(map[11]/2<max){
            max=map[11]/2;
        }
        if(map[14]/2<max){
            max=map[14]/2;
        }
        if(map[13]<max){
            max=map[13];
        }
        return max;
    }
}
