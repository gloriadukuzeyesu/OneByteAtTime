class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length; 
        int cols = board[0].length; 
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if( board[r][c] == word.charAt(0) && dfs(board,0, word, r, c) ){
                    return true;
                }
            }
        }
        return false; 
    }
    public boolean dfs (char[][] board, int index, String word, int r, int c) {
        
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word.charAt(index)) {
            return false; 
        }
        
        if(index == word.length() - 1) {
            System.out.println("1"); 
            return true; // word has been found 
        }
        
        board[r][c] = '#'; 
    
        if(dfs(board, index + 1, word, r + 1, c) || 
        dfs(board, index + 1, word, r - 1, c) ||
        dfs(board, index + 1, word, r, c + 1) ||
        dfs(board, index + 1, word, r, c - 1)) {
            System.out.println("2"); 
            return true; 
        }
        
        board[r][c] = word.charAt(index); 
        return false; 
    }
    
}