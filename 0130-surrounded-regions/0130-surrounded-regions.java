class Solution {
    
    public void dfs(char[][]board, int r, int c) {
        // check bounds
        if( r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != 'O') {
            return; 
        }
        board[r][c] = 'T';
        dfs(board, r - 1, c);
        dfs(board, r + 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);  
    }
    
    public void solve(char[][] board) {
        // loop on the edge v and H, change 0 = > T
        
        // adjecent 0 to the boarder 0 should also be T
        
        // change all internal 0 to x
        
        // flip back the T to 0 
        
        int ROWS = board.length; 
        int COLS = board[0].length; 
        
        for(int i = 0; i < ROWS; i++) {
            if(board[i][0] == 'O')  {
                dfs(board,i,0); 
            }

           if(board[i][COLS -1] == 'O') {
               dfs(board,i,COLS -1);
           }
        }
            
        // cols 
         for(int i = 0; i < COLS; i++) {
            if(board[0][i] == 'O') {
               dfs(board,0,i);
            }
            if(board[ROWS - 1][i] == 'O') {
              dfs(board,ROWS - 1,i);
            }
        }
        
        // step 2
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLS; j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X'; 
                }
            }
        }
        
        /// step 3
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLS; j++) {
                if(board[i][j] == 'T') {
                    board[i][j] = 'O'; 
                }
            }
        }
    }
}