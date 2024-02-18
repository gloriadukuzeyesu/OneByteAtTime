class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        
        // Arrays.sort(intervals, new Comparator<int[]>() { // n log n (merge)
        //     @Override
        //     // Compare values according to columns
        //     public int compare(final int[] entry1, final int[] entry2){
        //         return entry1[0] - entry2[0];    
        //     }
        // }); 
        
        Arrays.sort(intervals, (a, b)-> a[0] - b[0]); 
    
        
        for(int i = 0; i < intervals.length - 1; i++) {
              if( intervals[i][1] > intervals[i + 1][0] ){
                return false;
              } 
        }

        return true; 
        
    }
    // map 
}