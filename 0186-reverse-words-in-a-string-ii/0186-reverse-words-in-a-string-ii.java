class Solution {
    
    public void reverseWords(char[] s) {
            
    // reverseString(s, 0, s.length-1);
    helper(s, 0, s.length-1);
    int l=0;

          
   for(int i=0; i < s.length; i++){
       if(s[i] == ' '){
           // reverseString(s, l, i-1);
           helper(s, l, i -1);
           l = i+1;
       }
   }
   // reverseString(s, l, s.length-1);
        helper( s, l, s.length - 1); 
    
}
 
//   public void reverseString(char [] s, int l, int h){
    
//     while( l < h){
//         char temp = s[l];
//         s[l++] = s[h];
//         s[h--]= temp;
//     }
// }
    
    
    
//     public void reverseWords(char[] s) {
//         helper(0,s.length - 1,s);         
//         int l = 0; 
        
//         for(int r = 0; r < s.length; r++) {
//             if(s[r] == ' ') {
//                 helper(l, r - 1, s); 
//                 l = r + 1; 
//             } 
//         }
        
//         helper(l, s.length - 1, s); 
//     }
    
    public void helper(char[] s, int a, int b) {
        while( a < b) {
            char temp = s[a]; 
            s[a++] = s[b]; 
            s[b--] = temp; 
        } 
    }
}