class Solution {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int[] map = new int[26];
    
        for(int i=0;i<A[0].length();i++){
            map[A[0].charAt(i)-97]++;
        }
        
        for(int i=1;i<A.length;i++){
            int[] temp = new int [26];
            for(int j=0;j<A[i].length();j++){
                if(map[A[i].charAt(j)-97]>0){
                    temp[A[i].charAt(j)-97]++;
                    map[A[i].charAt(j)-97]--;
                }
            }
            map = Arrays.copyOf(temp,26);
        }
        
        for(int i=0;i<map.length;i++){
            while(map[i]>0){
            int num = i+97;
            char c = (char)num;
            list.add(Character.toString(c));
            map[i]--;
            }
        }
        return list;
    }
}