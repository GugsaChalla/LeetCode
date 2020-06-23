class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0;
        int[] currentPoint = points[0];
        
        for(int i=1; i<points.length; i++){
            int[] nextPoint = points[i];
            int horizontalDiff = Math.abs(nextPoint[0] - currentPoint[0]);
            int verticalDiff = Math.abs(nextPoint[1] - currentPoint[1]);
            time+= Math.min(horizontalDiff, verticalDiff); 
            time+= Math.abs(horizontalDiff-verticalDiff); 
            currentPoint = nextPoint; 
        }
        return time;
    }
}