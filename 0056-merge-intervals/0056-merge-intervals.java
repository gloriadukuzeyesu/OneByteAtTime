class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (int[]a, int[]b)->{
                    return a[0] - b[0];
         }); 
        
        List<int[]> list = new ArrayList<>(); 
        for(int i = 0; i < intervals.length; i++) {
            
            if(list.size() == 0 || list.get(list.size() - 1)[1] < intervals[i][0]) {
                list.add(intervals[i]);
            } else {
                int[] j = list.get(list.size() - 1);
                j[1] = Math.max(j[1], intervals[i][1]);
                list.set(list.size() - 1, j); 
            }
        }
        return list.toArray(new int[list.size()][]); 
        
    }
}