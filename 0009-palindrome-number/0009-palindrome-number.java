class Solution {
    public boolean isPalindrome(int x) {
       if(x<0){
           return false;
       }
        int reverse = 0;
        int orginal =x;  
        while(orginal!=0){
            reverse = reverse*10+orginal%10;
            orginal/=10;
        }
        return reverse == x;
    }
}