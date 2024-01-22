class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>(); 
        brackets.put('(', ')'); 
        brackets.put('{', '}'); 
        brackets.put('[', ']');
        
        // stack
        Stack<Character> stack = new Stack<>(); 
        for(char c : s.toCharArray()) {
            if(!brackets.containsKey(c)) {
                if(!stack.isEmpty()) {
                    char open_bracket = stack.peek(); 
                    char closing_bracket = brackets.get(open_bracket); 
                    if(closing_bracket != c) {
                        return false; 
                    } else{
                        stack.pop(); 
                    }
                } else {
                    return false; 
                }
                
            } else {
                stack.push(c); 
            }
        }
        return stack.isEmpty(); 
    }
}