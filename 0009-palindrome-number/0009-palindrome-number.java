class Solution {
    public boolean isPalindrome(int x) { 
        // when x is negative, we won't enter while loop. 
        int reverse = 0;
        int orginal =x;  
        while(orginal > 0){ 
            reverse = reverse*10+orginal%10;
            orginal/=10;
        }
        return reverse == x;
    }
}