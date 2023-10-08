// class Solution {
//     public int reverse(int x) {
//         //123
//         if(x == 0) return 0;
//         if(x > Integer.MAX_VALUE && x < Integer.MIN_VALUE) return 0; 
            
//         boolean isFalse = false;
        
//         if(x < 0) {
//             isFalse = true; 
//             x = -1 * x;
//         }
//         int res = 0;
//         while ( x != 0 ) {
//             res =  res * 10 + (x % 10);
//             x = x / 10;   
//         }
        
        
//         if(isFalse) {
//             res = -res;

//         }
        
//         return res; 
//     }
// }

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}