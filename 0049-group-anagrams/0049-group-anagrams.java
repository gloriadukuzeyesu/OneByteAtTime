class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); 
        for(String word : strs) {
            char[] char_word = word.toCharArray();
            Arrays.sort(char_word);
            String sortedWord = new String(char_word);
            if(!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values()); 
    }
}