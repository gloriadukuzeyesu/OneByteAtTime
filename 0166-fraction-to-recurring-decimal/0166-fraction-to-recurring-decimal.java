class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        // in case num = 0
        if(numerator == 0) {
            return "0"; 
        }
        
        // if(denominator == 0) return "Error"; 
        StringBuilder sb = new StringBuilder();
        // 
        if( numerator < 0 ^ denominator < 0) {
            sb.append("-"); 
        }
    
        long num = Math.abs(Long.valueOf(numerator)); 
        long deno = Math.abs(Long.valueOf(denominator)); 
        long fraction = num / deno; 
  
        sb.append(fraction);
        long rem = num % deno;
        
        if(rem == 0) {
            return sb.toString(); 
        } 
            // we have remainder. it will be fraction 
        sb.append(".");
        Map<Long, Integer> map = new HashMap<>(); 
        while(rem != 0) {
            if(map.containsKey(rem)) {
                sb.insert( map.get(rem), "("); 
                sb.append(")"); 
                break;
            }
            map.put(rem, sb.length()); 
            rem *= 10; 
            sb.append(rem/deno); 
            rem %= deno; 
        }
        return sb.toString();
        
    }
}