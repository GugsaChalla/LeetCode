class Solution {
    public int leastInterval(char[] tasks, int n) {
       
        if(n==0) return tasks.length;
        int count=0;
        int[] map = new int[26];
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer>heap= new PriorityQueue<>(Collections.reverseOrder());
       
        for(int i=0;i<tasks.length;i++){
            map[tasks[i]-'A']++;
        }
       
        for(int i=0;i<map.length;i++){
            if(map[i]>0) {
                heap.add(map[i]);
            }
        }
       
        while(!heap.isEmpty()) {
            list = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                if (heap.isEmpty() && list.isEmpty()) break;
                if (!heap.isEmpty()) {
                    int temp = heap.remove()-1;
                    if (temp !=0) {
                        list.add(temp);
                    }
                }
                count++;
            }
            for (int i=0;i<list.size();i++) heap.add(list.get(i));
        }
       
        return count;
    }
       
}