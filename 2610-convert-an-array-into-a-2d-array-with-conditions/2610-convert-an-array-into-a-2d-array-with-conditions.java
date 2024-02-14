class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>(); 
        List<List<Integer>> result = new ArrayList<>(); 
        
        for(int num : nums) {
            int row = 0; 
            if(frequency.containsKey(num)) {
                row = frequency.get(num); 
            } else{
                row = 0; 
            } 
            if( result.size() == row) {
                result.add(new ArrayList<>()); 
            }
            // Store the integer in the list corresponding to its current frequency.
            result.get(row).add(num); 
            frequency.put(num, frequency.getOrDefault(num, 0) + 1); 
        }
        return result; 
        
    }
}