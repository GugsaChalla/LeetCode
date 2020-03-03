class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] arr = new int[deck.length];
        LinkedList<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        q.add(deck[deck.length-1]);
        for(int i=deck.length-2;i>-1;i--){
            int temp = q.removeLast();
            q.addFirst(temp);
            q.addFirst(deck[i]);
        }
        
        for(int i=0;i<q.size();i++){
            arr[i]=q.get(i);
        }
        return arr;
    }
}