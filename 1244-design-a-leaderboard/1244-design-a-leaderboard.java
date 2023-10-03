class Leaderboard {
    Map<Integer, Integer> map; 

    public Leaderboard() {
        map = new HashMap<>(); 
        
    }
    
    public void addScore(int playerId, int score) {
        // check if the player already exists, otherwise udate their score
        map.put(playerId, map.getOrDefault(playerId, 0) + score); 
    }
    
    public int top(int K) {
        // max heap. 
        PriorityQueue<Integer> minHeap = new PriorityQueue <>( (a,b) -> a - b); 
        for(int score : map.values()) {
            if(minHeap.size() < K) {
                // add
                minHeap.add(score); 
            } else {
                if(score > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.add(score); 
                }
            }    
        }
        
        int sum = 0; 
        for(int i = 0; i < K ; i++) {
            sum += minHeap.poll();
        }
        return sum;
        
    }
    
    public void reset(int playerId) {
        map.put(playerId, 0); 
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */