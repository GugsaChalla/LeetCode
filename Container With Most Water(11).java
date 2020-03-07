class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1;
        int max= Integer.MIN_VALUE;
       
        while(start<end){
             int small = Math.min(height[start],height[end]);
             max=Math.max(max,small*(end-start));
            if(height[start]<height[end]){start++;}
            else{end--;}
        }
        return max;
    }
}
