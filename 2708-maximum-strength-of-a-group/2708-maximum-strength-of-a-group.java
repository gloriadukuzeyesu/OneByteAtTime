class Solution {
    public long maxStrength(int[] nums) {
        long posPr = 1; 
        long negPro = 1; 
        
        int maxNeg = Integer.MIN_VALUE;
        int NegCount = 0; 
        
        boolean hasPos = false; 
        boolean hasZero = false; 
        
        for(int num : nums) {
            if(num > 0) {
                posPr *= num;
                hasPos = true; 
            } else if (num < 0) {
                // negative 
                negPro *= num; 
                maxNeg = Math.max(maxNeg, num); 
                NegCount++;  
            } else {
                hasZero = true;
            }
        }
        
        // if we no negative number and no positive
        if(NegCount == 0 && !hasPos) {
            return 0;
        }
        
        // if there is even neg number
        if(NegCount % 2 == 0) {
            return posPr * negPro; 
        }
        
        // in case there is an odd number of negatives, remove the max one to maximize the product
        if(NegCount >= 2){
           return (negPro / maxNeg) * posPr;
        }
        if(hasPos) {
            return posPr;
        }
        if(hasZero) {
            return 0;
        }
        return maxNeg;
    }
}