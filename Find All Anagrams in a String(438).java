class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[26];
        int[] copy = new int[26];
        int count=0;
        int index=0;
        
        for(int i=0;i<p.length();i++){
            arr[p.charAt(i)-97]++;
            copy[p.charAt(i)-97]++;
        }
        
        for(int i=0;i<s.length();i++){
            if(count==0){index=i;}
            if(copy[s.charAt(i)-97]>0){
                count++;
                copy[s.charAt(i)-97]--;
                if(count==p.length()){
                    list.add(i+1-count);
                    copy=Arrays.copyOf(arr,26);
                    count=0;
                    i=index;
                }
            }
            else{
               copy=Arrays.copyOf(arr,26);
                count=0;
                i=index;
            }
        }
        return list;
    }
}