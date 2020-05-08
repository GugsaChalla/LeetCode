class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        Arrays.fill(arr,-1);
        int[] set = new int[26];
        for(int i=0;i<s.length();i++){
            if(set[s.charAt(i)-97]==0){
                if(arr[s.charAt(i)-97]==-1){
                    arr[s.charAt(i)-97]=i;
                }
                else{
                    arr[s.charAt(i)-97]=-1;
                    set[s.charAt(i)-97]++;
                }
            }
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-97]!=-1){
                return i;
            }
        }
        return -1;
    }
}