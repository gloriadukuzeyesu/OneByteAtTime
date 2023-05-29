public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
         // write your code here
        StringBuilder sb = new StringBuilder(); 
        for(String str: strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString(); 
        
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
           // write your code here

        List<String> res = new ArrayList<>(); 
        int i = 0; 
        while (i < str.length()) {

            int j = i; 
            while (str.charAt(j) != '#') {
                j+=1;
            }
            // at this point j is pointing at #
            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1 + length;
            res.add(str.substring(j + 1, i));
        }
        return res;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));