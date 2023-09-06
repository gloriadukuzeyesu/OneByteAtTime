class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charSt = new Stack<>(); 
        Stack<Integer> counter = new Stack<>(); 
        for(char c : s.toCharArray()) {
            if(charSt.size() > 0 && charSt.peek() == c) {
                int curr = counter.pop(); 
                counter.push(curr + 1); 
            } else {
                
                counter.push(1);
                charSt.push(c);
            }
            
            
            if(counter.peek() == k) {
                  charSt.pop();
                  counter.pop(); 
                // for(int i = 0; i < k ; i++) {
                //     charSt.pop();
                //     counter.pop(); 
                // }
            }
        }
        StringBuilder sb  = new StringBuilder(); 
        while(charSt.size()> 0) {
            int end = counter.pop();
            char curr = charSt.pop();
            while(end > 0) {
                sb.append(curr); 
                end--;
            }
            //sb.append(charSt.pop());
        }
        return sb.reverse().toString(); 
    }
}