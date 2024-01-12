public class Codec {
    // the key here is to use a delimeter which is on an ascii value. 
    // Example: π 
    

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();
        for(String str : strs) {
            encoded_string.append(str).append("π"); 
        }
        System.out.println(encoded_string.toString()); 
        return encoded_string.toString(); 
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> strs = new ArrayList<>();
        StringBuilder sb = new StringBuilder(); 
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            if(c != 'π') {
                sb.append(c); 
            }else{
                // end of the string
                strs.add(sb.toString()); 
                sb.setLength(0);
            }
        }
        return strs; 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));