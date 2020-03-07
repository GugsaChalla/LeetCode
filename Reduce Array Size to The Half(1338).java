class Solution {
    public int minSetSize(int[] arr) {
        int count =1;
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((o1,o2)->o2.getValue()-o1.getValue());
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        heap.addAll(map.entrySet());
        int size = heap.poll().getValue();
        while((arr.length/2)>size){
            count++;
            size+=heap.poll().getValue();
        }
        return count;
    }
}