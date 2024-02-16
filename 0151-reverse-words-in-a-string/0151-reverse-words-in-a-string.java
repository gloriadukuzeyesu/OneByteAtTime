class Solution {
    public String reverseWords(String s) {
        String[] splittedWOrds = s.trim().split("\\s+"); 
        System.out.println(Arrays.toString(splittedWOrds)); 
        int i = 0, j = splittedWOrds.length - 1; 
        while( i < j) {
            String temp = splittedWOrds[i]; 
            splittedWOrds[i] = splittedWOrds[j]; 
            splittedWOrds[j] = temp; 
            i++; 
            j--; 
        }        
        return String.join(" ", splittedWOrds);
    }
}