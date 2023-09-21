class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       //  strs = ["eat","tea","tan","ate","nat","bat"]
        // map
        // Key       value 
         // aet  ===>   [eat,tea,ate] 
         // ant  ===>   [tan,nat]
         // abt  ===>   [bat]
        
        Map<String, List<String>> map = new HashMap<>(); 
        for(int i = 0; i < strs.length; i++) {
            String curr = strs[i]; 
            char[] sortedCurr = curr.toCharArray(); // array
            Arrays.sort(sortedCurr); 
            String sortedString = String.valueOf(sortedCurr); 
            
            if(!map.containsKey(sortedString)) {
                List<String> val = new ArrayList<>();
                val.add(curr);
                map.put(sortedString,val); 
            } else {
                map.get(sortedString).add(curr);
                map.put(sortedString, map.get(sortedString));
            } 
        }
        List<List<String>> result = new ArrayList<>(); 
        for(String key : map.keySet()) {
            result.add( map.get(key) );
        }
        return result;   
    }
}