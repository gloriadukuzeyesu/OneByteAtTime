class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars); 
            String current = new String(chars);
            if(!map.containsKey(current)) {
                map.put(current, new ArrayList<>());
            } 
            map.get(current).add(strs[i]);
        }
       return new ArrayList<>(map.values());
    }
}