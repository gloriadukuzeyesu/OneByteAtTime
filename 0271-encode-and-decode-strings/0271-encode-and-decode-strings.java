public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        
        for(int i = 0;  i< strs.size(); i++) { 
          encoded.append(strs.get(i).length()).append("#").append(strs.get(i));   
        }
        
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        // get the length 
        int i = 0; 
        while ( i < s.length()) {
            int j = i; 
            while (s.charAt(j) != '#') {
                j++;
            }
            int leng = Integer.parseInt(s.substring(i,j));
            i = j + 1 + leng;
            String currentStr = s.substring(j + 1, i);
            decoded.add(currentStr);     
        }
        return decoded;      
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));