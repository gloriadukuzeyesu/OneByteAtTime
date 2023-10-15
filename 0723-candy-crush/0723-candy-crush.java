class Solution {
     int ROWS;
     int COLS; 
    
     Set<Pair<Integer, Integer>> find(int[][]board) {
       
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        // ver
        for(int r = 1; r < ROWS - 1; r++) {
          for(int c = 0; c < COLS; c++) {
              if(board[r][c] == 0) {
                  continue;
              }
              if(board[r][c] == board[r - 1][c] && board[r][c] ==  board[r + 1][c]) {
                  set.add(new Pair<>(r, c));
                  set.add(new Pair<>(r - 1, c));
                  set.add(new Pair<>(r + 1, c));
              }
          }
        }
         
        // hor
        for(int r = 0; r < ROWS; r++) {
            for(int c = 1; c < COLS - 1; c++) {
                if(board[r][c] == 0) {
                    continue;
                }
                if(board[r][c] == board[r][c + 1] && board[r][c] == board[r][c - 1]) {
                    set.add(new Pair<>(r,c));
                    set.add(new Pair<>(r,c + 1));
                    set.add(new Pair<>(r,c - 1));
                }
           
            }
        }

        return set;    
     }
    
    void crush(Set<Pair<Integer, Integer>> set, int[][] board) {       
        for(Pair<Integer, Integer> pair : set) {
            int r = pair.getKey();
            int c = pair.getValue();
            board[r][c] = 0;
        }
    
        
    }
    
    void drop(int[][] board) {
        for(int c = 0; c < COLS; c++) {
            int lowerZero = -1; 
            for(int r = ROWS - 1; r >= 0; r--) {
                if (board[r][c] == 0) {
                    lowerZero = Math.max(lowerZero, r); 
                } else if(lowerZero >= 0) {
                    // board[r][c != 0
                        int temp = board[r][c];
                        board[r][c] =  board[lowerZero][c];
                        board[lowerZero][c] = temp; 
                        lowerZero --;

                }
            }
        }
    }
     
    public int[][] candyCrush(int[][] board) {
     ROWS = board.length;
     COLS = board[0].length;
    
     Set<Pair<Integer, Integer>> crushedSet = find(board); 
        while(!crushedSet.isEmpty()) {
             crush(crushedSet, board);
             drop(board); 
             crushedSet = find(board);
        }
       
       
         return board; 
    }
    
    
    
}