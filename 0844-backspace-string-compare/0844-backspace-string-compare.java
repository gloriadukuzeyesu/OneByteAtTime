class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t)); 
    
    }
    private String build(String S) {
        Stack<Character> stack = new Stack<>(); 
        for(char c : S.toCharArray()) {
            if(c != '#') {
                stack.push(c); 
            } else if(!stack.isEmpty()) {
                stack.pop(); 
            }
        }
        return String.valueOf(stack); 
    }
}