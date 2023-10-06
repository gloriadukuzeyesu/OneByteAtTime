class Solution {
    public int compress(char[] chars) {
        int index = 0; 
        int i = 0; 
        
        if(chars.length == 1) {
            return 1; 
        }
        while (i < chars.length) {
            int j = i; 
            //  tells when weare at the end of a consecutive group of characters
            while (j < chars.length && chars[j] == chars[i]) {
                j++; 
            } 
            chars[index++] = chars[i]; 
            if( j - i > 1) {
                String count = j - i + "";
                // compress and add count
                for(char c : count.toCharArray()){
                    chars[index++] = c;
                }
            }
            i = j; 
        }
        return index;
    }
}