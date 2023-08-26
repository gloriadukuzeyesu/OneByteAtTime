class Solution {
    
     public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketLookup = new HashMap<>(3);

        bracketLookup.put(')', '(');
        bracketLookup.put('}', '{');
        bracketLookup.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (bracketLookup.containsKey(c)) {
                if (!brackets.isEmpty() && bracketLookup.get(c).equals(brackets.peek())) {
                    brackets.pop();
                } else {
                    return false;
                }
            } else {
                brackets.push(c);
            }
        }

        return brackets.isEmpty();
    }
    
//     public boolean isValid(String s) {
//         Map<Character, Character> map = new HashMap<>(); 
//         map.put('(', ')');
//         map.put('{', '}');
//         map.put('[',']');
        
//         for(int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i); 
//             if(map.containsKey(c)) {
                
//             }
//         }
        
//     }
}