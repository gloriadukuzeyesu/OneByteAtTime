class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() { // n log n (merge)
            @Override
            // Compare values according to columns
            public int compare(final int[] entry1, final int[] entry2){
                return entry1[0] - entry2[0];    
            }
        }); 
        
        int size = intervals.length; 
        
        for(int i = 0; i < size - 1; i++) {
            int currentEnd = intervals[i][1]; // end 
            int nextStart = intervals[i + 1][0];
              if( currentEnd > nextStart ){
                return false;
              }
        }

        return true; 
        
    }
    // map 
}