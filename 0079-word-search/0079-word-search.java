class Solution {
    public static int[][] DRCT = {{1,0},{-1,0},{0,1},{0,-1}};
    public boolean exist(char[][] board, String word) {
        int ROWS = board.length;
        int COLS = board[0].length; 
        
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLS; j++) {
                if(board[i][j] == word.charAt(0) && backTrack(board, i,j,word,0)) {
                    return true;
                }
            }
        }
        return false;   
    }
    
    private boolean backTrack(char[][]board, int i, int j, String word, int count) {
        if(count == word.length()) {
            return true;  // word is found 
        }
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(count)) {
            return false; 
        }
        
        // add the i, j to visited, we will mark it instead; 
        char temp = board[i][j];
        board[i][j] = ' '; 
        
        boolean found = false; 
        
        // native approach but still works 
//         if (
//          backTrack(board, i + 1, j, word, count + 1) || 
//          backTrack(board, i - 1, j, word, count + 1) ||
//          backTrack(board, i, j + 1, word, count + 1) ||
//          backTrack(board, i, j - 1, word, count + 1)) 
//         {
//              found = true; 

//         }
        
        for(int[] dir : DRCT) {
             if( backTrack(board, i + dir[0] , j + dir[1], word, count + 1)) {
                found = true; 
                break;
             }    
            
        }
        board[i][j] = temp; 
        return found;   
    }
}