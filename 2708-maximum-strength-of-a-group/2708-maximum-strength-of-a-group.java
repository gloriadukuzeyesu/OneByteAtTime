class Solution {
    public long maxStrength(int[] nums) {
        long posPro = 1;
        long negPro = 1;
            
        int maxNeg = Integer.MIN_VALUE; 
        
        int negCount = 0;
        
        boolean hasPos = false;
        boolean hasZero = false;
        
        for(int num : nums) {
            if(num > 0) {
                posPro  = posPro * num;
                hasPos = true;
            } else if (num < 0) {
                negPro *= num;
                negCount++;
                maxNeg = Math.max(maxNeg,num);
                
            } else {
                hasZero = true;
            }
            
        }
        
        if(negCount == 0 && !hasPos) {
            return 0;
        }
        
        if(negCount % 2 == 0) {
            return posPro * negPro;
        }
        
        if(negCount >= 2) {
           return (negPro / maxNeg) * posPro;
        }
        
        if(hasPos) {
            return posPro;
        }
        
        if(hasZero) {
            return 0;
        }
        
        return maxNeg;
    }
}