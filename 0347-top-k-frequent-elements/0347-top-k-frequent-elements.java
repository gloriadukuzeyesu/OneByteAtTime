class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>map = new HashMap<Integer, Integer>(); 
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); 
        }

        // create the bucket
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(int key : map.keySet()) {
            int frequency = map.get(key); 
            if(bucket[frequency] == null) {
                bucket[frequency]  = new ArrayList<Integer>(); 
            }
            bucket[frequency].add(key); 
        }

        // create the array for the results
        int[] res = new int[k]; 
        int index = 0; 
        for(int pos = bucket.length - 1; pos >= 0 && index < k; pos--) {
            if(bucket[pos] != null) {
                for(int element : bucket[pos]) {
                    res[index] = element; 
                    index++; 
                }
            }
        }
        return res; 
    }
}