class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        //Declare Objects and Variables
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((o1, o2) ->             o2.getValue()-o1.getValue());
        
        //Add array elements to hashmap
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            
        }
        //add hashmap entry sets to heap
        heap.addAll(map.entrySet());
        //add most occuring element K times
        for(int a=0;a<k;a++){
            list.add((int) heap.poll().getKey());
        }
        
        return list;
    }
}
