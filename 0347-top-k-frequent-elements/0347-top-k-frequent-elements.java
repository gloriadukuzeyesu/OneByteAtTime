class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); 
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>( (a,b) -> a.getValue() - b.getValue() );                                                     
        for(int i = 0; i < nums.length; i++) map.put(nums[i], map.getOrDefault(nums[i],0) + 1); 
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
            if(pq.size() > k)  pq.poll();
        }
        int[] res = new int[k];
        int i = 0; 
        while(!pq.isEmpty()) {
            int num = pq.poll().getKey(); 
            res[i] = num; 
            i++; 
        }
        return res; 
     }
}      
     
        
        
        
        
                                                                            
                               
 