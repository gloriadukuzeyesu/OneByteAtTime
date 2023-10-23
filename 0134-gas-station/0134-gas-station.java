class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;  // Total gas available.
        int currentGas = 0;  // Current gas tank level.
        int startStation = 0;  // Potential starting station.

        for (int i = 0; i < n; i++) {
            int diff = gas[i] - cost[i];
            totalGas += diff;
            currentGas += diff;

            // If the current gas level becomes negative, reset the starting station and gas tank.
            if (currentGas < 0) {
                currentGas = 0;
                startStation = i + 1;
            }
        }

        // If the total gas available is greater than or equal to the total cost, a valid starting station exists.
        if (totalGas >= 0) {
            return startStation;
        } else {
            return -1;  // Cannot complete the circuit.
        }
    }
        
    
}