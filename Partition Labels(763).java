class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        int start=0,end=0;
        int[] map =new int[26];
        for(int i=0;i<S.length();i++){
            map[S.charAt(i)-97]=i;
        }
        for(int i=0;i<S.length();i++){
            end=Math.max(end, map[S.charAt(i)-97]);
            if(i==end){
                list.add(end-start+1);
                start=end+1;
            }
        }
        return list;
    }
}
