package WeekFive;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int originalColor=image[sr][sc];
        floodFill(image,sr,sc,newColor,originalColor);
        return image;
    }
    public void floodFill(int[][] image, int sr, int sc, int newColor,int originalColor){
        if(sr>=image.length || sr<0 || sc>=image[0].length || sc<0 || image[sr][sc]==newColor || image[sr][sc]!=originalColor){
            return;
        }
        image[sr][sc]=newColor;
        floodFill(image,sr,sc+1,newColor,originalColor);
        floodFill(image,sr,sc-1,newColor,originalColor);
        floodFill(image,sr-1,sc,newColor,originalColor);
        floodFill(image,sr+1,sc,newColor,originalColor);
    }
}
