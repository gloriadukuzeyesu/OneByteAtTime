class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int n = gas.length; 
        int totoSurplus = 0; 
        int surplus = 0; 
        int start = 0; 
        for(int i = 0; i < n; i++) {
            totoSurplus += gas[i] - cost[i]; 
            surplus += gas[i] - cost[i]; 
            if(surplus < 0) {
                surplus = 0; 
                start = i + 1; 
            }
        }
        return totoSurplus < 0 ? -1 : start; 
        
        // if(totoSurplus < 0 ) {
        //     return - 1; 
        // } else {
        //     return start; 
        // }
    }
}

// int n = gas.length;
//         int total_surplus = 0;
//         int surplus = 0;
//         int start = 0;
        
//         for(int i = 0; i < n; i++){
//             total_surplus += gas[i] - cost[i];
//             surplus += gas[i] - cost[i];
//             if(surplus < 0){
//                 surplus = 0;
//                 start = i + 1;
//             }
//         }
//         return (total_surplus < 0) ? -1 : start;