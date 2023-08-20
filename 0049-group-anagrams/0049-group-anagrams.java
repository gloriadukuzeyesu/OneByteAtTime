class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>(); 
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars); 
            String current = new String(chars);
            if(!map.containsKey(current)) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(current, list);
            } else {
                map.get(current).add(strs[i]);
            }
        }
        for(String str : map.keySet()) {
            res.add(map.get(str));
        }
        return res; 
    }
}