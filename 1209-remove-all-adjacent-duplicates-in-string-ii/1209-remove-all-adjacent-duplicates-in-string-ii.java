class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charSt = new Stack<>(); 
        Stack<Integer> counter = new Stack<>(); 
        for(char c : s.toCharArray()) {
            if(charSt.size() > 0 && charSt.peek() == c) {
                counter.push(counter.pop() + 1); 
            } else {
                counter.push(1);
                charSt.push(c);
            }
            if(counter.peek() == k) {
                  charSt.pop();
                  counter.pop(); 
            }
        }
        StringBuilder sb  = new StringBuilder(); 
        while(charSt.size()> 0) {
            int end = counter.pop();
            char curr = charSt.pop();
            while(end --> 0) {
                sb.append(curr); 
                //end--;
            }
        }
        return sb.reverse().toString(); 
    }
}