class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!=ch2){
                boolean res1=ispalindrome(s,i+1,j);
                boolean res2=ispalindrome(s,i,j-1);
                if(res1==true || res2==true){
                    return true;
                }else{
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
    
    public boolean ispalindrome(String s,int i,int j){
     
        while(i<j){
         char ch1=s.charAt(i);
         char ch2=s.charAt(j);
            if(ch1!=ch2) return false;
            i++;
            j--;
        }
        return true;
    }
}