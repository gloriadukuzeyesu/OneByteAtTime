class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) {
            // no flood fill
            return image; 
        }
        int oldColor = image[sr][sc]; 
        
        colorWithNewColor(image, sr, sc, oldColor, color); 
        return image; 
    }
    public void colorWithNewColor(int[][] image, int sr, int sc, int oldColor, int newColor) {
        
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor) {
            return; 
        }

        if(image[sr][sc] == oldColor) {
            image[sr][sc] = newColor; 
        }
        
        colorWithNewColor(image, sr - 1, sc, oldColor, newColor); 
        colorWithNewColor(image, sr + 1, sc, oldColor, newColor); 
        colorWithNewColor(image, sr, sc - 1, oldColor, newColor); 
        colorWithNewColor(image, sr, sc + 1, oldColor, newColor); 
    }
    
}