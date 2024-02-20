class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*
        1. map {num: frequecy}
        2. Heap sort based on the frequency of the numbers
        3. pop k element of the heap and 
        4. store them in the resul array
        5. return result array 
        
        time complexity: n log n 
        space O(n)
        */
        
        Map<Integer, Integer> frequency_map = new HashMap<>(); 
        for(int num : nums) {
            frequency_map.put(num, frequency_map.getOrDefault(num, 0) + 1); 
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>( 
            (a, b) -> frequency_map.get(a) - frequency_map.get(b)); 
        
        for(int num : frequency_map.keySet()) {
            maxHeap.offer(num); 
            if(maxHeap.size() > k) {
                maxHeap.poll(); 
            }
        }
        
        int[] result = new int[k]; 
        int index = 0; 
        
        while(!maxHeap.isEmpty()) {
            result[index++] = maxHeap.poll();    
        }
    
        return result; 
        
    }
}