class Solution {
    public boolean checkIfPangram(String sentence) {
       Set<Character> check = new HashSet<>(); 
    
        for(int i = 0; i < sentence.length(); i++) {
           check.add(sentence.charAt(i));
        }
        return check.size() == 26;  
    }
}