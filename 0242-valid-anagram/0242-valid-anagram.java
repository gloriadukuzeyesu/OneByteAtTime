class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false; 
        }
        Map<Character, Integer> sMap = new HashMap<>(); 
        Map<Character, Integer> tMap = new HashMap<>(); 
        
        for(int i = 0; i < s.length(); i++) {
            if(sMap.containsKey(s.charAt(i))) {
                // update its value 
                int newValue = sMap.get(s.charAt(i)) + 1; 
                sMap.put(s.charAt(i), newValue);
            } else {
                sMap.put(s.charAt(i), 1);
            }  
        }
        
        for(int i = 0; i < t.length(); i++) {
            if(tMap.containsKey(t.charAt(i))) {
                // update its value 
                int newValue = tMap.get(t.charAt(i)) + 1; 
                tMap.put(t.charAt(i), newValue);
            } else {
                tMap.put(t.charAt(i), 1);
            }  
        }
        // compare two maps.
        return sMap.equals(tMap); 
    }
}