class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            if(c == ']') {
                // build the string by poping off the stack until you hit the open bracket 
                List<Character> list = new ArrayList<>(); 
                while (stack.peek() != '['){
                    list.add(stack.pop());    
                }
                stack.pop(); // remove the [

                // get the k
                int base = 1; 
                int k = 0; 
                while( !stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = k + (stack.pop() - '0')  * base;
                    base = base * 10; 
                }
                
                // add the decoded string back to the stack
                while (k != 0) {
                    for (int j = list.size() - 1; j >=0; j--) {
                        stack.push(list.get(j));
                    }
                    k--; 
                }  
            } else {
                stack.push(c); 
            }
        }
        // stack contains only the decode string 
        char[] res = new char[stack.size()]; 
        for(int x = res.length - 1; x >=0; x--) {
            res[x] = stack.pop();
        }
        // build a return string from char[]
        return new String(res); 
        
    }
}