class Solution {
    public int minMutation(String start, String end, String[] bank) {
        if(bank.length==0) return -1;
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<bank.length;i++) set.add(bank[i]);
        if(!set.contains(end)) return -1;
        LinkedList<String> q = new LinkedList<>();
        char[] choice = {'A','C','G','T'};
        int level=0;
        q.add(start);
        q.add(null);
        while(!q.isEmpty()){
            String current = q.remove();
            if(current==null){
                q.add(null);
                level++;
                if(q.peek()==null) return -1;
            }
            else{
                char[] gene = current.toCharArray();
                for(int i=0;i<gene.length;i++){
                    char original =gene[i];
                    for(int j=0;j<choice.length;j++){
                        gene[i]=choice[j];
                        if(String.valueOf(gene).equals(end)) return level+1;
                        if(set.contains(String.valueOf(gene))){
                            set.remove(String.valueOf(gene));
                            q.add(String.valueOf(gene));
                        }
                    }
                    gene[i]=original;
                }
            }

            
        }
        return -1;
    }
}