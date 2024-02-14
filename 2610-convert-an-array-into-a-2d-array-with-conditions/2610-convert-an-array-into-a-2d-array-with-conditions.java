class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>(); 
        List<List<Integer>> result = new ArrayList<>(); 
        
        for(int num : nums) {
            int index = 0; 
            
            if(frequency.containsKey(num)) {
                // get index 
                index = frequency.get(num); 
            }
            
            if(result.size() == index) {
                result.add(new ArrayList<>()); 
            }
            
            result.get(index).add(num); // store num in the corresponding list/row
            
            frequency.put(num, frequency.getOrDefault(num, 0) + 1); 
        }
        return result; 
    }
}