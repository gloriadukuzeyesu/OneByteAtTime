class Solution {
    public void reverseWords(char[] s) {
//       reverse the whole sentence
      reverse(s, 0,s.length - 1); 
      int start = 0;
      // reverse every single word
      for(int i = 0; i < s.length; i++) {
        if(s[i] == ' ') {
          reverse(s, start, i - 1);
          start = i + 1; 
        }
      }
//       revese the last word
      reverse(s, start, s.length - 1);
      
    }
    private  void reverse (char[] arr, int s, int e) {
      while( e < arr.length && s < e) {
        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp; 
        s++;
        e--; 
      }
    }
}