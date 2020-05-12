class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int start=image[sr][sc];
        image[sr][sc]=newColor;
        if(sr<image.length-1&&image[sr+1][sc]==start&&image[sr+1][sc]!=newColor){
            image=floodFill(image,sr+1,sc,newColor);
        }
        if(sr-1>-1&&image[sr-1][sc]==start&&image[sr-1][sc]!=newColor){
            image=floodFill(image,sr-1,sc,newColor);
        }
        if(sc-1>-1&&image[sr][sc-1]==start&&image[sr][sc-1]!=newColor){
            image=floodFill(image,sr,sc-1,newColor);
        }
        if(sc<image[sr].length-1&&image[sr][sc+1]==start&&image[sr][sc+1]!=newColor){
            image=floodFill(image,sr,sc+1,newColor);
        }
        return image;
    }
}