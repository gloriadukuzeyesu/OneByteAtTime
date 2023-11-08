class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (int[]a, int[]b)-> {
            return a[0] - b[0]; }); 
        List<int[]> merged = new ArrayList<>(); 
        
        for(int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current interval does not overlap with the prev, then append it
            if(merged.size() == 0 || merged.get(merged.size() - 1)[1] < interval[0]) {
                // 
                merged.add(interval);
            } else {
                // merge
                int[]current = merged.get(merged.size() - 1); 
                current[1] =  Math.max(merged.get(merged.size() - 1)[1], interval[1]); 
                merged.set(merged.size() - 1, current); 
            }
            
        }
        return merged.toArray(new int[merged.size()][]); 
        
    }
}