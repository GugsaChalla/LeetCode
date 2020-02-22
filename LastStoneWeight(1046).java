class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            heap.add(stones[i]);
        }
        while(heap.size()>1){
            heap.add(heap.poll()-heap.poll());
        }
        
        return heap.poll();
    }
}