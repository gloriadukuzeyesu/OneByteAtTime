class Solution {
    public int[] decrypt(int[] code, int k) {
      int[] res = new int[code.length];
      if (k == 0) return res;

      if( k > 0) {
       
        for(int i = 0; i < res.length; i++) {
           int sum = 0;
            for (int j = 1; j <= k; j++) { //int j = 1; j <= k; j++
              sum += code[ (i + j) % code.length];
            }
          res[i] = sum; 
        }
      }
      
      else if( k < 0) {
        
          for (int i = 0; i < res.length; i++) {
            int sum = 0;
            for (int j = 1; j <= k * -1 ; j++) { //j = 1; j <= -1 * k;
              sum += code[ (i - j + code.length) % code.length]; //(i - j + code.length) % code.length
            }
            res[i] = sum; 
          }
      }
      
      return res;
    }
}