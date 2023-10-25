class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        //[5, - 2]  -2
        Stack<Integer> stack = new Stack<>(); 
        for(int i = 0; i < asteroids.length; i++) {
            
            if(stack.isEmpty() || asteroids[i] > 0) {
                stack.push(asteroids[i]); 
            } else {
                // System.out.print(stack.peek() );
                while (true) {
                    int curr = asteroids[i]; // - 8 
                    if(stack.peek() < 0 ) {
                        stack.push(curr); 
                        break; 
                    } else 
                        if(stack.peek() == - curr) {
                        stack.pop();
                        break; 
                    }  else if(stack.peek() > - curr) {
                         break; 
                    } else {
                         stack.pop();
                         if(stack.isEmpty()) {
                             stack.push(curr); 
                             break; 
                         }
                     }
                }
            }
            
        }
        int [] res = new int[stack.size()]; 
        for(int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop(); 
        }
        return res; 
    }
}