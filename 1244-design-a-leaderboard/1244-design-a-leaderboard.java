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
            //map.put(playerId, map.getOrDefault(playerId, 0) + score); 
    }
    
    public int top(int K) {
        // sorting 
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet())  {
            list.add(map.get(key)); // list contains
        }
        // quick select 
        Collections.sort(list); 
        int sum = 0; 
        // for(int i = list.size() - 1 ; i >= K; i--) {
        //     sum = sum + list.get(i); 
        // }
        int index = list.size() - 1; 
        while ( K > 0) {
            sum = sum + list.get(index); 
            index --; 
            K--; 
        }
        return sum;    
    }
    
    public void reset(int playerId) {
        map.put(playerId, 0);    
       // map.remove(playerId); // remove them from 
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */