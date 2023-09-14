class Leaderboard {

    Map<Integer, Integer> map; 
    public Leaderboard() {
        map = new HashMap<>();   
    }
    
    public void addScore(int playerId, int score) {
        if(map.containsKey(playerId)) {
            map.put(playerId, map.get(playerId) + score); 
        }else {
            map.put(playerId, score); 
        }
    }
    
    public int top(int K) {
        // sorting 
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet())  {
            list.add(map.get(key)); // list contains
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>( (a,b) -> a - b);
        for(int score : map.values()) {
            if(maxHeap.size() < K ) {
                maxHeap.offer(score); 
            } else if (score > maxHeap.peek()) {
                maxHeap.poll(); 
                maxHeap.offer(score); 
            }
        }
        // int total = 0; 
        // for(int score : maxHeap) {
        //     score = score + score; 
        // }
// //         for(int i = 0; i < list.size(); i++) {
// //             if(maxHeap.size() < K) {
//                 maxHeap.offer(list.get(i)); 
//             } else if ( maxHeap.peek() > list.get(i) ) {
//                  maxHeap.poll(); 
//                  maxHeap.offer(list.get(i)); 
//             }
//         }
        
        // traverse the heap and find sum
        Iterator <Integer> it = maxHeap.iterator(); 
        int total = 0; 
        while(it.hasNext()) {
            total = total + it.next(); 
        }
        return total;    
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