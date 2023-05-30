class Codec:
    def encode(self, strs: List[str]) -> str:
        """Encodes a list of strings to a single string.
        """
        res=""
        for s in strs:
            res += str(len(s)) + "#" + s
        return res
            
        

    def decode(self, s: str) -> List[str]:
        """Decodes a single string to a list of strings.
        """
        list, i = [], 0
        while (i < len(s)):
            j = i
            while(s[j] != "#"):
                j +=1
            length_of_word = int(s[i:j])
            list.append(s[j + 1 : j + 1 + length_of_word])
            i = j + 1 + length_of_word
        return list
            
            
        
        


# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(strs))