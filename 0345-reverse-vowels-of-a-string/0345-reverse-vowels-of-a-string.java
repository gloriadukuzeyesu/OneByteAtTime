class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(); 
        set.add('e');
        set.add('o');
        set.add('u');
        set.add('i');
        set.add('a');

        set.add('E');
        set.add('O');
        set.add('U');
        set.add('I');
        set.add('A');

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