class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); 
        
//         for (int[] interval : intervals) {
//             if (newInterval == null || interval[1] < newInterval[0]) res.add(
//                 interval
//             ); else if (interval[0] > newInterval[1]) {
//                 res.add(newInterval);
//                 res.add(interval);
//                 newInterval = null;
//             } else {
//                 newInterval[0] = Math.min(interval[0], newInterval[0]);
//                 newInterval[1] = Math.max(interval[1], newInterval[1]);
//             }
//     }

        
        for(int[] currentInterval : intervals) {
            // case1: currentInterval comes before newInterval
            if(newInterval == null || currentInterval[1] < newInterval[0]) {
                result.add(currentInterval); 
            }
            
            // case2: currentInterval comes after newInterval
            else if(currentInterval[0] > newInterval[1]) {
                result.add(newInterval); 
                result.add(currentInterval); 
                newInterval = null; 
            }
            // case 3: currentInterval overlapps with newInterval
            else{
                newInterval[0] = Math.min(currentInterval[0], newInterval[0]); 
                newInterval[1] = Math.max(currentInterval[1], newInterval[1]);
            }
        }
        if(newInterval != null) {
            result.add(newInterval); 
        }
        
        int[][] res = new int[result.size()][2]; 
        for(int i = 0; i < result.size(); i++) {
            res[i] = result.get(i); 
        }
        return res; 
        
    }
}