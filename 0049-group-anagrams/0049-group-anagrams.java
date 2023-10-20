class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>(); 
        Map<String, List<String>> groups = new HashMap<>(); 
        for(String curr : strs) {
            char[] currChar = curr.toCharArray(); 
            Arrays.sort(currChar); 
            String sortedcurr = String.valueOf(currChar); 
            groups.putIfAbsent(sortedcurr,new ArrayList<>());
            groups.get(sortedcurr).add(curr); 
        }
        return new ArrayList<>(groups.values()); 
        
    }
}