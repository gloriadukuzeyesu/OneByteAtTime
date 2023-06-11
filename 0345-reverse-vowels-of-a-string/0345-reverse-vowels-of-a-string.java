class Solution {
    public String reverseVowels(String s) {
        
        Set<Character> set = new HashSet<>(Arrays.asList('e', 'o', 'u','i','a','E','O','U','I','A'));

        StringBuilder sb = new StringBuilder(s); 
        int i = 0; 
        int j = sb.length() - 1; 

        while ( i < j) {
            char c = sb.charAt(i);  
            char k = sb.charAt(j); 

            if(set.contains(c) && set.contains(k)) {
                sb.setCharAt(i, k); 
                sb.setCharAt(j, c);
                i++;
                j--;
            } else if (set.contains(c)) {
                j--; 
            } else if (set.contains(k)) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return sb.toString();    
    }
}