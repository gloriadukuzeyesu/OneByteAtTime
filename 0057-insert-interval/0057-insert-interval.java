class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        /*
        1. Create a list of resulted intervals
        2. loop over intervals
        3. for each interval in intervals
           - interval comes before newInterval
                * add interval to the result list
           - interval comes after newInterval
                * add newInterval to the result list
                * add interval
           - interval overlaps with newInterval
               * merge
        
        */
        
        List<int[]> result = new ArrayList<>();
        for(int[] interval : intervals) {
            if(newInterval == null || interval[1] < newInterval[0]) {
                result.add(interval); 
            } else if(interval[0] > newInterval[1]){
                result.add(newInterval); 
                result.add(interval); 
                newInterval = null; 
            } else {
               newInterval[0] = Math.min(newInterval[0], interval[0]); 
               newInterval[1] = Math.max(newInterval[1], interval[1]); 
            }
        }
        if(newInterval != null) {
            result.add(newInterval);
        }
        return result.toArray(new int[result.size()][]); 
        
    }
}