class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // map { sorted : [unsorted anagrams]}
        Map<String, List<String>> groups = new HashMap<>(); 
        for(String str : strs) {
            char [] sortedStrArray = str.toCharArray(); 
            Arrays.sort(sortedStrArray); 
            String sortedStr = String.valueOf(sortedStrArray);
            if(!groups.containsKey(sortedStr)) {
                groups.put(sortedStr, new ArrayList<>()); 
            }
            groups.get(sortedStr).add(str); 
        }
        return new ArrayList<>(groups.values()); 
    }
}