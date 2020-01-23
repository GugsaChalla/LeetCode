class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        ArrayList<Integer> listQ= new ArrayList<>();
        ArrayList<Integer> listW= new ArrayList<>();
        for(int i=0;i<queries.length;i++){
        char small='z';
        int freq=0;
            for(int j=0;j<queries[i].length();j++){
                if(queries[i].charAt(j)<small){
                small=queries[i].charAt(j);
                freq=1;
            }
           else if(queries[i].charAt(j)==small){freq++;}
            }
            listQ.add(freq);
        }
       // System.out.println(listQ.get(0));
         for(int k=0;k<words.length;k++){
        char smallest='z';
        int frequency=0;
            for(int l=0;l<words[k].length();l++){
            if(words[k].charAt(l)<smallest){
                smallest=words[k].charAt(l);
                frequency=1;
            }
            else if (words[k].charAt(l)==smallest){
                frequency++;
            }
            }
            listW.add(frequency);
        }
        int[] arr = new int[queries.length];
        int n=0;
        for(int a=0;a<listQ.size();a++){
            int count=0;
            
            for(int b=0;b<listW.size();b++){
        
                if(listQ.get(a)<listW.get(b)){
                    count++;
                }
            }
            arr[n]=count;
            n++;
        }
        return arr;
    }
}