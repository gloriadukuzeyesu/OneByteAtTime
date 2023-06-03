class Solution {
    public boolean isPowerOfTwo(int n)
    {
        //UMPIRE ==> Understand, Match , Plan , Implement , Review , Evaluate                 
//         int temp = 1;
       
//         while (temp < n) temp *= 2;
        
//         return n == temp;
        return  n > 0 && (n & (n - 1)) == 0;
     }
}