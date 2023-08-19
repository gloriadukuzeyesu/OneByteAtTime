class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] arr = new int[k]; 
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()  // Compare entries by frequency
        );
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.offer(entry);
            if(maxHeap.size() > k) {
                maxHeap.poll(); 
            }
        }      
        int i = 0; 
        while (!maxHeap.isEmpty()) {
            arr[i] = maxHeap.poll().getKey();
            i++;
        }
        return arr;
     
    }
}