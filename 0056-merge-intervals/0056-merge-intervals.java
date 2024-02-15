class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>(); 
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); 
        
        int[] tempInterval = null; 
        for(int[] interval : intervals) {
            if(tempInterval == null || interval[0] > tempInterval[1]) {
                result.add(interval); 
                tempInterval = interval;
            } else {
                tempInterval[0] = Math.min(interval[0], tempInterval[0]); 
                tempInterval[1] = Math.max(interval[1], tempInterval[1]); 
            }
        }

        return result.toArray(new int[result.size()][2]);   
        
        
        
//         List<int[]> result = new ArrayList<>(); 
//         Arrays.sort(intervals, (a, b) -> a[0] - b[0]); 
        
//         System.out.println("Sorted: " + Arrays.toString(intervals)); 
        
//         int[] tempInterval = null; 
//         for(int[] interval : intervals) {
//             if(tempInterval == null || interval[0] > tempInterval[1]) {
//                 // there is no overlapp 
//                 result.add(interval); 
//                 tempInterval = interval; // Update tempInterval
//             } else {
//                 tempInterval[0] = Math.min(interval[0], tempInterval[0]); 
//                 tempInterval[1] = Math.max(interval[1], tempInterval[1]); 
//             }
//         }
        
        // return result.toArray(new int[result.size()][2]);   
        
        
    }
}