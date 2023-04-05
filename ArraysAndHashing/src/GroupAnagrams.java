import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            // convert each string to char to sort it
            char[] wordChar = word.toCharArray();
            Arrays.sort(wordChar);  // sort it
            // add it to the map
            String key = String.valueOf(wordChar);
            // create an arraylist for each key.
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        for (String key : map.keySet()) {
            results.add(map.get(key));
        }
        return results;
    }
}
