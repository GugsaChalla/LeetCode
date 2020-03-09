class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new LinkedList<>();
        int[] check = new int[arr.length];
        q.add(start);
        check[start]=1;
        while (!q.isEmpty()) {
            int current = q.poll();
            if (arr[current] == 0) return true;
            int sub = current - arr[current];
            if (sub >= 0 && check[sub]==0) {
                q.add(sub);
                check[sub]=1;
            }
            int add = current + arr[current];
            if (add < arr.length && check[add]==0) {
                q.add(add);
                check[add]=1;
            }
        }
        return false;
    }
}