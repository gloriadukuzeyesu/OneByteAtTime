class Solution {
    public String restoreString(String s, int[] indices) {
      int length = indices.length; // 8 
   
      HashMap<Integer, Character> map = new HashMap<>(); 
      for(int i = 0; i < indices.length; i++) {
          map.put(indices[i], s.charAt(i));  
      }
      int index = 0; 
      StringBuilder ss = new StringBuilder(); 
      while(index < length) {
        char c = map.get(index); 
        ss.append(c);
        index++; 
      }
      return ss.toString(); 

    }
}