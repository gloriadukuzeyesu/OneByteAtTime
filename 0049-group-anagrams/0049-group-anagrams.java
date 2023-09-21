class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); 
        for(int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray(); // array
            Arrays.sort(arr); 
            String sortedString = String.valueOf(arr); 
            
            if(!map.containsKey(sortedString)) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedString,list); 
            } else {
                map.get(sortedString).add(strs[i]);
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